package Scanner;
import java.util.Scanner;
public class Beraksi {
    
    public static void main(String [] args){
        int a,b,c;
//        double a,b,c;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan 1 :");
        a = input.nextInt();
        System.out.print("Masukkan Bilangan 2 :");
        b = input.nextInt();
        System.out.print("Masukkan Bilangan 3 :");
        c = input.nextInt();
        
        Aritmatika obj = new Aritmatika(a,b,c);
        obj.cetak();
        
        
//        System.out.print("Masukkan Bilangan 1 :");
//        a = input.nextInt();
//        
//        System.out.print("Masukkan Bilangan 2 :");
//        b = input.nextInt();
//            System.out.print("Masukkan Nilai Tugas : ");
//            a = input.nextDouble();
//            System.out.print("Masukkan Nilai UTS   : ");
//            b = input.nextDouble();
//            System.out.print("Masukkan Nilai UAS : ");
//            c = input.nextDouble();
//
//        Aritmatika obj = new Aritmatika();
////        obj.penjumlahan(a, b);
//          obj.NilaiAkhir(a, b, c);
    }
    
}
