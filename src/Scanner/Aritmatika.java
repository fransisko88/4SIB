package Scanner;
public class Aritmatika {
    
    int hasil;
    double na;
    public void penjumlahan(int bil1, int bil2){
        hasil = bil1 + bil2;
        System.out.println("Hasil Penjumlahan : " + hasil);
    }
    
    public void NilaiAkhir(double tugas,double uts,double uas){
        na = (2*tugas + 3*uts + 5*uas)/10;
        System.out.println("Nilai Akhir : " + na);
    }
    int a,b,c,proses;
    public Aritmatika(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void cetak(){
       proses = a + b * c; 
        System.out.println("Hasil : " + proses);
    }
  
}
