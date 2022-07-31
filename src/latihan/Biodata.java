package latihan;
public class Biodata {
    
//    String nama1,nama2,nama3,nama4;
//        
//    public Biodata(String nama1,String nama2, String nama3, String nama4){
//        this.nama1 = nama1;
//        this.nama2 = nama2;
//        this.nama3 = nama3;
//        this.nama4 = nama4;
//    }
//    public void kelompok1(){
//        System.out.println("Kelompok 1 ");
//        System.out.println("Anggota 1 : " + nama1);
//        System.out.println("Anggota 2 : " + nama2);
//    }
//    public void kelompok2(){
//        System.out.println("Kelompok 2 ");
//        System.out.println("Ketua  : " + nama2);
//        System.out.println("Anggota 1 : " + nama3);
//        System.out.println("Anggota 2 : " + nama4);
//    }
    
    
//    String nama;
//    int npm;
//    String kelas;
//    
//    
//    public void setNama(String nama){
//        this.nama = nama;
//    }
//    
//    public String getNama(){
//        return nama;
//    }
//    
//    public void setNPM(int npm){
//        this.npm = npm;
//    }
//    
//    public int getNPM(){
//        return npm;
//    }
//    
//    public void setKelas(String kelas){
//        this.kelas = kelas;
//    }
//    
//    public String getKelas(){
//        return kelas;
//    }
    
    public int nilai1;
    private int nilai2,uts,tugas,uas;
    private String nama;
    public String nama1;
    
    public Biodata(){
        this.nilai1 = 5;
        this.nilai2 = 10;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNilai(int nilai){
        this.nilai2 = nilai;
    }
    
    public int getNilai2(){
        return nilai2;
    }
    
    public void setUts(int uts){
        this.uts = uts;
    }
    
    public int getUts(){
        return uts;
    }
    
    public void setTugas(int tugas){
        this.tugas = tugas;
    }
    
    public int getTugas(){
        return tugas;
    }
    
    public void NA(){
        int na = uts+tugas;
        System.out.println("Nilai Akhir " + na);
        
        if(na > 80){
            System.out.println("Nilai Akhir A");
        }else{
            System.out.println("Nilai Akhir B");
        }
    }
    
    
    
    
    
    

    
    
    
}
