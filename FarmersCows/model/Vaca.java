package model;

public class Vaca {
    private int id;
    private static int numVacas;

    public Vaca() {
        this.id = numVacas++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
