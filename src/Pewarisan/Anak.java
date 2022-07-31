package Pewarisan;
public class Anak {
    
    private double tugas,uts,uas;
    public void TI(){
        System.out.println("Teknik Informatika");
    } 
    public void SI(){
        System.out.println("Sistem Informasi");
    }
    
    private int bil1;
    
    //setter 
    public void bilangan1(int bil1){
        this.bil1 = bil1;
    }
    //getter 
    public int getBil1(){
        return bil1;
    }
    
    public void setTugas(double tugas){
        this.tugas = tugas;
    }
    
    public double getTugas(){
        return tugas;
    }
    
    public void setUts(double uts){
        this.uts = uts;
    }
    
    public double getUts(){
        return tugas;
    }
    
    public void setUas(double uas){
        this.uas = uas;
    }
    
    public double getUas(){
        return uas;
    }
    
   

}
