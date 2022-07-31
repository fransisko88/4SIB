package latihan;
public class LatihanKonstrutor {
    
    String nama1;
    int npm1;
   public LatihanKonstrutor(String nama , int npm){
       this.nama1 = nama;
       this.npm1 = npm;
   }
   
   public void cetak(){
       System.out.println("Nama Saya adalah " + nama1);
       System.out.println("NPM Saya adalah " + npm1);        
   }
   
}
