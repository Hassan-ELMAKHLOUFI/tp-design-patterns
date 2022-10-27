import Compression.Compression;
import Filtrage.Filtrage;
import image.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
       image image = new image();
        int[] data = {1,2,3};
        System.out.println("donnez le nom de class a implimenter pour effectuer les filters");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Filtrage filtrage ;
        if (str.equals("ImplNonStandard")){
             filtrage = (Filtrage) Class.forName("Filtrage.Adaptateur").newInstance() ;
        }
        else {
            filtrage = (Filtrage) Class.forName("Filtrage."+str).newInstance() ;
        }
        image.setFiltrage(filtrage);
        image.filter(data);



        //compression
        image image1=new image();

        System.out.println("--------------------");
        System.out.println("Donnez le nom de l'implimentation de comression que vous voullez ");
        str =scanner.nextLine();
         Compression  compression= (Compression) Class.forName("Compression."+str).newInstance();
        image1.setCompression(compression);

        image1.compresser();


    }
}
