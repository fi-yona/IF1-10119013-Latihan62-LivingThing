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


public class Human extends LivingThing{
    
    private String nama;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public  void walk(String nama){
        System.out.println(nama + " sedang berjalan");
    }
}
