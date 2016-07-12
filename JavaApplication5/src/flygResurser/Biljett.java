package flygResurser;

import resurser.FlygMatMenyer;

public class Biljett {
    private int plats;
    private int pris;
    private int klass;
    private boolean mat;
    private FlygMatMenyer matRatt;
    private String flight;
    private String forNamn;
    private String efterNamn;
    //private int kundNummer;

    public Biljett(int plats, int klass, boolean mat, FlygMatMenyer matRatt, String flight,
            String forNamn, String efterNamn){
        this.plats = plats;
        this.pris = setPris(plats, mat, matRatt);
        this.klass = klass;
        this.mat = mat;
//        if (mat)
//            this.matRatt = matRatt;
//        else this.matRatt = null;    
        this.flight = flight;
        this.forNamn = forNamn;
        this.efterNamn = efterNamn;
    }
    
    public int setPris(int plats, boolean mat, FlygMatMenyer matRatt){
        int biljettPris = 0;
        
        //1a eller 2a klass
        if (plats < 6) biljettPris += 20000;
        else biljettPris += 5000;
        
       // if(mat) biljettPris += matRatt.getFood();
        
        return biljettPris;
    }
    
    
}
