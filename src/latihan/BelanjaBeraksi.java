package latihan;
public class BelanjaBeraksi {
    public static void main(String [] args){
        //Belanja bl = new Belanja("Cabe",5000,2000);
//        bl.cetakInformasi();
        
        Belanja bl1 = new Belanja();
//        bl1.setNama("Fransisko");
//        System.out.println("Nama : " + bl1.getNama());
        bl1.setBelanja(4000,2000);
        System.out.println("Total Belanja : " + bl1.getBelanja());
        bl1.setBelanja(6000,3000);
        System.out.println("Total Belanja : " + bl1.getBelanja());
    }
}
