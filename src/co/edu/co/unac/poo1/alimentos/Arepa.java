package co.edu.co.unac.poo1.alimentos;

public class Arepa{

    private Float precio;
    private Float tamano;

    public Arepa(){

    }

    public Arepa(Float precio, Float tamano) {
        this.precio = precio;
        this.tamano = tamano;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getTamano() {
        return tamano;
    }

    public void setTamano(Float tamano) {
        this.tamano = tamano;
    }
}
