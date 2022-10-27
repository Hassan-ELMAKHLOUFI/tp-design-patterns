package Compression;

public abstract class Compression {
    public int[] CompressionTemplate(int[] data){
        System.out.println("avant operation 1 ");
        operationAbs1();
        System.out.println("avant operation 2");
        operationAbs2();
        return data ;
    }
    protected abstract void operationAbs1();
    protected abstract void operationAbs2();
}
