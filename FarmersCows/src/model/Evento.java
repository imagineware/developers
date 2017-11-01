package model;

public class Evento {
    private Granjero granjero;
    private Vaca vaca;

    public Evento(Vaca vaca, Granjero granjero){
        this.granjero=granjero;
        this.vaca=vaca;
    }

    public Granjero getGranjero() {
        return granjero;
    }

    public void setGranjero(Granjero granjero) {
        this.granjero = granjero;
    }

    public Vaca getVaca() {
        return vaca;
    }

    public void setVaca(Vaca vaca) {
        this.vaca = vaca;
    }
}
