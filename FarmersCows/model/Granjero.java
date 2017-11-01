package model;

public class Granjero {
    private int id;
    private static int numGranjero;

    public Granjero() {
        this.id = numGranjero++;
    }

    public Evento milk(Vaca vaca) {
        System.out.println("El granjero " + this.id +
                " ordeña a la vaca " + vaca.getId());

        return new Evento(vaca, this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
