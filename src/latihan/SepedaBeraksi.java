package latihan;
public class SepedaBeraksi {
    public static void main(String [] args){
        Sepeda sepeda = new Sepeda();
        
        sepeda.setGir(1);
        System.out.println(sepeda.getGir());
        sepeda.setGir(2);
        System.out.println(sepeda.getGir());
        sepeda.setGir(-2);
        System.out.println(sepeda.getGir());

    }
    
}
