package Polymorphism;
public class Bagian1 {
   
    
    //Overloading
    public void Biodata(){
        System.out.println("Nama saya Fransisko");
    }
    public void Biodata(String nama){
        System.out.println("Nama saya " + nama);
    }
    //Overriding
    int point;
    public void Nilai(int bil){
        point = point + bil;
    }
    public int getNilai(){
        return point;
    }
    
    
    
    
    
}
