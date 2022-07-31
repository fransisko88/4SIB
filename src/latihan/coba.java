package latihan;
public class coba {
    String nama;
    int npm;
    
    public void biodata(){
        System.out.println("Fransisko Sihombing");
        System.out.println("4SIB");
        System.out.println("Jurusan Teknik Informatika");
        System.out.println("Universitas Methodist Indonesia");
    }
    
    public void belajar(){
        System.out.println("Saya sedang belajar PBO");
        System.out.println("Di Kelas 4SIB");
        
    }
    
    public void biodataParameter(String nama,int npm,String kampus){
        System.out.println("Nama saya adalah " + nama);
        System.out.println("NPM saya adalah "+ npm);
        System.out.println("Kampus saya di " + kampus);
    }
}
