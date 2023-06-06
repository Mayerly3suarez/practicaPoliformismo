package co.edu.co.unac.poo1.alimentos;

import co.edu.co.unac.poo1.procesos.Madurados;

public class Mazorca implements Madurados {

    private Integer totalgranos;
    private Float precio;
    private Float pesogramo;
    private String color;

    public Mazorca() {
    }

    public Mazorca(Integer totalgranos, Float precio, Float pesogramo, String color) {
        this.totalgranos = totalgranos;
        this.precio = precio;
        this.pesogramo = pesogramo;
        this.color = color;
    }

    public Integer getTotalgranos() {
        return totalgranos;
    }

    public void setTotalgranos(Integer totalgranos) {
        this.totalgranos = totalgranos;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getPesogramo() {
        return pesogramo;
    }

    public void setPesogramo(Float pesogramo) {
        this.pesogramo = pesogramo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Boolean tostar() {
        return null;
    }

    @Override
    public Float getOrdenarPrecio() {
        return this.precio;
    }

    @Override
    public Void VerInformacion() {
        System.out.println("Precio ordenado" + this.precio);
        return null;
    }


}
