package image;

import Compression.Compression;
import Filtrage.Filtrage;

public class image  {

    private int[] data ;
    private Filtrage filtrage ;
    Compression compression ;
    public int[] filter (int [] data) {
      return   filtrage.operationFilter(data);
    }

    public int[] compresser (){
        data = compression.CompressionTemplate(data);
        return data ;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public Filtrage getFiltrage() {
        return filtrage;
    }



    public Compression getCompression() {
        return compression;
    }

    public void setCompression(Compression compression) {
        this.compression = compression;
    }

    public void setFiltrage(Filtrage filtrage) {
        this.filtrage = filtrage;
    }
}
