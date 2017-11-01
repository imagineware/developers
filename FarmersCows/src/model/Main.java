package model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Evento> listaEventos = new ArrayList<Evento>();
        Granjero g1 = new Granjero();
        Granjero g2 = new Granjero();
        Granjero g3 = new Granjero();

        Vaca v1 = new Vaca();

        listaEventos.add(g3.milk(v1));

        Evento e2 =g2.milk(v1);

        listaEventos.add(e2);

        listaEventos.remove(0);

        System.out.println("El granjero con id: " + listaEventos.get(1).getGranjero().getId() +
                " ha ordeñado la vaca: " + listaEventos.get(1).getVaca().getId());

    }
}
