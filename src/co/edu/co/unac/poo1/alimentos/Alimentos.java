package co.edu.co.unac.poo1.alimentos;

public abstract class Alimentos {

    private boolean hornear;

    public Alimentos(){

    }

    public Alimentos(boolean hornear) {
        this.hornear = hornear;
    }

    public boolean isHornear() {
        return hornear;
    }

    public void setHornear(boolean hornear) {
        this.hornear = hornear;
    }
}
