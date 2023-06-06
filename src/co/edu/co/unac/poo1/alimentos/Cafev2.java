package co.edu.co.unac.poo1.alimentos;

import co.edu.co.unac.poo1.procesos.Madurados;

public class Cafev2 extends Cafe implements Madurados {

    private Float precio;

    public Cafev2(){
        super();
    }

    public Cafev2(String nombre, Float tamano, Sabores sabor, Integer altura, Variedades variedad, Integer edad, String serial, Float precio) {
        super(nombre, tamano, sabor, altura, variedad, edad, serial);
        this.precio = precio;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public Float getOrdenarPrecio() {
        return this.precio;
    }

    @Override
    public Void VerInformacion() {
        System.out.println("---------------------------------------");
        System.out.println("El color del pasajero es: " + this.precio + ".");
        return null;

    }
}
