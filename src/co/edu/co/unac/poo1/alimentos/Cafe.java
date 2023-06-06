package co.edu.co.unac.poo1.alimentos;

import co.edu.co.unac.poo1.procesos.Madurados;

public class Cafe extends Pandebono implements Madurados {

    private Integer altura;
    private Variedades variedad;
    private Integer edad;
    private String serial;

    public Cafe() {
        super();
    }

    public Cafe(String nombre, Float tamano, Sabores sabor, Integer altura, Variedades variedad, Integer edad, String serial) {
        super(nombre, tamano, sabor);
        this.altura = altura;
        this.variedad = variedad;
        this.edad = edad;
        this.serial = serial;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Variedades getVariedad() {
        return variedad;
    }

    public void setVariedad(Variedades variedad) {
        this.variedad = variedad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public static Cafe procesarLineaArchivoPlano(String linea) {
        Cafe cafe = new Cafe();
        String[] lineaCafe = linea.split("\\|");
        String[] lineaTexto = lineaCafe[0].split("SERIAL:");
        cafe.serial = lineaTexto[1];
        lineaTexto = lineaCafe[1].split("NOMBRE:");
        cafe.nombre = lineaTexto[1];
        lineaTexto = lineaCafe[2].split("ALTURA:");
        cafe.altura = Integer.valueOf(lineaTexto[1]);
        lineaTexto = lineaCafe[3].split("EDAD:");
        cafe.edad = Integer.valueOf(lineaTexto[1]);
        lineaTexto = lineaCafe[4].split("VARIEDAD:");
        cafe.variedad = Variedades.valueOf(lineaTexto[1]);
        lineaTexto = lineaCafe[5].split("SABOR:");
        cafe.sabor = Sabores.valueOf(lineaTexto[1]);
        lineaTexto = lineaCafe[6].split("TAMAÑO:");
        cafe.tamano = Float.valueOf(lineaTexto[1]);
        return cafe;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "altura= " + altura +
                ", variedad= '" + variedad + '\'' +
                ", edad= " + edad +
                ", serial= '" + serial + '\'' +
                ", nombre= '" + nombre + '\'' +
                ", tamano= " + tamano +
                ", sabor= '" + sabor + '\'' +
                '}';
    }


    @Override
    public Float getOrdenarPrecio() {
        return null;
    }

    @Override
    public Void VerInformacion() {
        return null;
    }
}



