package Polymorphism;
public class Bagian2 extends Bagian1 {
    
    @Override
    public void Nilai(int bil){
        super.Nilai(bil);
        point = (point * getNilai())/2;
        System.out.println("Hasil : " + point);
    }
}
