package co.edu.co.unac.poo1;

import co.edu.co.unac.poo1.alimentos.*;
import co.edu.co.unac.poo1.procesos.Madurados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unidad1 {

    private static final String RUTA_ARCHIVO_CAFES = "C:\\Users\\MAYERLY ANDREA\\Desktop\\INGENIERÍA DE SISTEMAS\\PRACTICA EXAMEN FINAL\\src\\co\\edu\\co\\unac\\poo1\\alimentos\\cafe.txt";

   public static void mostrarPlano(){
       List<Cafe> listCafe = leerArchivoPlanoCafes();
           listCafe.sort(Comparator.comparing(Cafe::getSerial));
           for (Cafe cafe : listCafe){
               System.out.println(cafe);
           }
   }
    public static List<Cafe> leerArchivoPlanoCafes() {
        Stream<String> lines = null;
        Path pathArchvioPlano = Paths.get(RUTA_ARCHIVO_CAFES);
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        try {
            lines = Files.lines(pathArchvioPlano);
            List<String> datos = lines.collect(Collectors.toList());
            for (String dato : datos) {
                Cafe nuevoCafe = Cafe.procesarLineaArchivoPlano(dato);
                listaCafes.add(nuevoCafe);
            }
        } catch (IOException ioex){
            System.err.println("Error de IO al leer el archivo plano " + ioex.getMessage());
        } finally {
            assert lines != null;
            lines.close();
        }
        return listaCafes;

    }

    public static void MapaProductos(){
        Pandebono pandebono1 = new Pandebono("Rollo",120F, Sabores.dulce);
        Pandebono pandebono2 = new Pandebono("Cascarita",130F, Sabores.salado);
        Cafev2 cafe1 = new Cafev2("Sello Rojo",120F,Sabores.suave,15, Variedades.Arabiga,2,"A1",12000F);
        Cafev2 cafe2 = new Cafev2("Nescafé",15F,Sabores.dulce,10, Variedades.Bourbon,3,"A2",13000F);
        Mazorca mazorca1 = new Mazorca(23,1200F,120F,"Blanco");
        Mazorca mazorca2 = new Mazorca(25,1600F,160F,"Amarillo");

        List<Madurados> listamaduros = new LinkedList<>();
        listamaduros.add(pandebono1);
        listamaduros.add(pandebono2);
        listamaduros.add(cafe1);
        listamaduros.add(cafe2);
        listamaduros.add(mazorca1);
        listamaduros.add(mazorca2);

        listamaduros.sort(Comparator.comparing(Madurados::getOrdenarPrecio));

        Map<Float, Madurados> mapaproductos = new HashMap<>();
        mapaproductos.put(pandebono1.getOrdenarPrecio(), pandebono1);
        mapaproductos.put(pandebono2.getOrdenarPrecio(), pandebono2);
        mapaproductos.put(cafe1.getPrecio(), cafe1);
        mapaproductos.put(cafe2.getPrecio(), cafe2);
        mapaproductos.put(mazorca1.getPrecio(), mazorca1);
        mapaproductos.put(mazorca2.getPrecio(), mazorca2);

        //Recorro el mapa
        List<Madurados> listaOrdenada = new LinkedList<>(mapaproductos.values());
        for (Madurados liebre: listaOrdenada){
            liebre.VerInformacion();

    }
    }
    public static void contarpanbono(){
        List<Pandebono> listaPandebono = MapaProductos();
        int contadorpanIguales=0;
        for(int i=0;i<listaPandebono.size();i++){
            for(int j=i+1; j<listaPandebono.size(); j++){
                if(listaPandebono.get(i).equals(listaPandebono.get(j))){
                    contadorpanIguales+=2;
                }
            }
        }
        System.out.println("El numero de pan de bono igual en la lista es de "+ contadorpanIguales);
    }

}



