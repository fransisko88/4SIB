package latihan;
public class Belanja {
    
   private String nm;
   private int total;
   int hasil;
   int harga,diskon;
   String nama;
   
//   public Belanja(String Namabarang,int harga,int diskon){
//       this.harga = harga;
//       this.nama = Namabarang;
//       this.diskon = diskon;
//   }
//   
//   public void cetakInformasi(){
//       System.out.println("Nama barang : " + nama);
//       System.out.println("Harga barang : " + harga);
//       System.out.println("Diskon barang : " + diskon);
//       hasil = harga-diskon;
//       System.out.println("Total Harga : " + hasil);
//   } 
//   
//   
//   public void setNama(String nama){
//       this.nm = nama;
//   }
//   
//   public String getNama(){
//       return nm;
//   }
   
   public void setBelanja(int belanja1,int belanja2){
     total = total + belanja1 + belanja2;
//       if(belanja1 == 6000){
////         System.out.println("Normal");
//           total = total+belanja1;
//       }else if(belanja1 == 4000){
//           total = total+belanja1;
//       }else{
//         System.out.println("Mahal");
//       }
   }
   
   public int getBelanja(){  
       return total;
   }
}
