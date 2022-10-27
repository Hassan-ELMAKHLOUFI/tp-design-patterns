package Filtrage;

import Filtrage.Filtrage;

public class FiltrageImpl1 implements Filtrage {
    @Override
    public int[] operationFilter(int[] data) {
        System.out.println("operation filtre de l'implimentation 1");
        return data;
    }
}
