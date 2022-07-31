package Kondisi;
import java.util.Scanner;
public class latihanIF {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        
        // Kondisi If Bersarang
        
//        System.out.print("Masukkan Umur Anda : ");
//        int umur = input.nextInt();
//        
//        if(umur >= 18){
//            System.out.print("Status Menikah Y/N");
//            String status = input.next();
//            
//            if(status.equals("Y")){
//                System.out.println("Selamat !");
//            }else if(status.equals("N")){
//                System.out.println("Silahkan Menikah !");
//            }else{
//                System.out.println("Inputan Salah");
//            }    
//        }else{
//            System.out.println("Anda Masih Bocil");
//        }

        // Perulangan For
        int i;
        
        System.out.print("Masukkan Batas Bawah : ");
        int bawah = input.nextInt();
        
        System.out.print("Masukkan Batas Atas : ");
        int atas = input.nextInt();
        
        
        
        for(i=bawah; i<=atas; i++){
            
//            if(i%2 == 0){ //Genap
//                System.out.println(i);
//            }
            
            if(i%2 == 1){ //Ganjil
                System.out.println(i);
            }  
        }
        
        
        
        
    }
    
}
