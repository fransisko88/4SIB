package Pewarisan;
public class Induk extends Anak {
    
    
    int bil2,hasil;
    
    public void UMI(){
        System.out.println("Universitas Methodist Indonesia");
    }
    
    public void bilangan2(int bil2){
        hasil = getBil1() + bil2;
        System.out.println("Hasil Penjumlahan : " + hasil);
    }
    
    public void NA(){
        double na;
        na = (2*getTugas() + 3*getUts() + 5*getUas())/10;
         System.out.println("Nilai Akhir : " + na);
        if(na > 80){
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Tidak Lulus");
        }
    }
    
  
 
}
