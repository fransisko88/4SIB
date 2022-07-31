package latihan;
public class Aritmatika {
    
    double nilai1,nilai2,nilai3;
    public Aritmatika(double nilai1 ,double nilai2){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }
    
    public Aritmatika(double nilai1 ,double nilai2, double nilai3){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }
    
    public void LuasPersegiPanjang(){
        double LuasPersegiPanjang = nilai1 * nilai2;
        System.out.println("Luas Persegi Panjang Adalah "+  LuasPersegiPanjang);
    }
    
    public void LuasSegitiga(){
        double LuasSegitiga = 0.5* nilai1 * nilai2;
        System.out.println("Luas Segitiga Panjang Adalah "+  LuasSegitiga);
    }
    
    public void VolumeBalok(){
        double volume =  nilai1 * nilai2 * nilai3;
        System.out.println("Volume Balok Adalah "+  volume);
    }
    
    
}
