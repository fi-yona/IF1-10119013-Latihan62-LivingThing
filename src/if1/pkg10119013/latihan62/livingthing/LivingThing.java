/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan62.livingthing;

/**
 *
 * @author Fiona Avila
 */


public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama + " bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " makan");
    }
}
