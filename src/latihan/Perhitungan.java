
package latihan;

public class Perhitungan {
    
    public void belanja(int buah1, int buah2, int buah3){
        System.out.println("Harga buah pertama adalah " + buah1);
        System.out.println("Harga buah kedua adalah " + buah2);
        System.out.println("Harga buah ketiga adalah " + buah3);
        
        double total;
        total = (2 * buah1 + 3*buah2 + 5*buah3)/10;
        System.out.println("Total belanja adalah " + total);
        
    }
}
