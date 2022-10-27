package Filtrage;

public class Adaptateur extends ImplNonStandard implements Filtrage {
    @Override
    public int[] operationFilter(int[] data) {
        appliquerFiltre("encien filtre ",data);
        System.out.println("encien filtre");
        return data;
    }
}
