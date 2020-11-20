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


public class Main {

    public static void main(String[] args) {
        Human h = new Human();
        h.setNama("Fiona Avila Putri");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
        
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
