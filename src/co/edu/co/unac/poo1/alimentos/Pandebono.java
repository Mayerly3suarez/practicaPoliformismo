package co.edu.co.unac.poo1.alimentos;

import co.edu.co.unac.poo1.procesos.Madurados;

import java.util.Objects;

public class Pandebono implements Madurados {

    protected String nombre;
    protected Float tamano;
    protected Sabores sabor;


    public Pandebono(){

    }
    public Pandebono(String nombre, Float tamano, Sabores sabor) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getTamano() {
        return tamano;
    }

    public void setTamano(Float tamano) {
        this.tamano = tamano;
    }

    public Sabores getSabor() {
        return sabor;
    }

    public void setSabor(Sabores sabor) {
        this.sabor = sabor;
    }

    @Override
    public Boolean tostar() {
        return null;
    }

    @Override
    public Float getOrdenarPrecio() {
        return null;
    }

    @Override
    public Void VerInformacion() {
        return null;
    }
    @Override
    public boolean equals(Object obj) {
        if(!obj.getClass().equals(Pandebono.class)){
            return false;
        } else {
            Pandebono panbonuObj = (Pandebono) obj;
            return this.nombre.equals(panbonuObj.nombre) &&
                    Objects.equals(this.nombre, panbonuObj.nombre) &&
                    this.sabor.equals(panbonuObj.sabor);
        }
    }
}

