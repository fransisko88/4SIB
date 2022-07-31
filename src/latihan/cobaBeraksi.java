package latihan;
public class cobaBeraksi {
    public static void main(String [] args){
        coba cb = new coba();
        
        cb.nama = "Fransisko Sihombing";
        cb.npm = 218510017;
        
        System.out.println(cb.nama);
        System.out.println(cb.npm);
        cb.biodata();
        cb.belajar();

        cb.biodataParameter("Fransisko Sihombing", 218510017,"UMI");

    }
}
