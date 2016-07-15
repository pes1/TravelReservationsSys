package flygResurser;

import resurser.FlygMatMenyer;

public class Biljett {
    private int plats;
    private int pris;
    private String klass;
    private boolean mat;
    private FlygMatMenyer matRatt;
    private String flight;
    private String forNamn;
    private String efterNamn;
    

    public Biljett(int plats, String klass, boolean mat, FlygMatMenyer matRatt, String flight,
            String forNamn, String efterNamn){
        this.plats = plats;
        this.pris = setPris(plats, mat, matRatt);
        this.klass = klass;
        this.mat = mat;
        this.matRatt = matRatt;
        this.flight = flight;
        this.forNamn = forNamn;
        this.efterNamn = efterNamn;
    }
    
    public int setPris(int plats, boolean mat, FlygMatMenyer matRatt){
        int biljettPris = 0;
        
        //1a eller 2a klass
        if (plats < 6) biljettPris += 5000;
        else biljettPris += 20000;
        
        return biljettPris;
    }
    
    public int getPris() {
        int sum = 0;
        if(mat) {
            sum =  matRatt.getPrice();
        }
        if(klass.equals("First class")) {
            sum += 20000;
        }
        else {
            sum += 5000;
        }
        return sum;
       
    }
    
    public void utskrift() {
        System.out.println("Blåklint");
        System.out.println("======================");
        System.out.println("Namn: " + this.forNamn + " " + this.efterNamn);
        System.out.println("Flight: " + this.flight);
        System.out.println("Klass: " + this.klass + " Plats: " +  this.plats);
        System.out.println("Mat: " + this.matRatt.getFood());
        System.out.println("Pris: " + getPris());
        
    }
    
   public String toString() {
       return plats + " " +  klass + " " + mat + " " + matRatt.getFood() + " "  + flight + " " + forNamn + " " + efterNamn;
   } 
    
}
