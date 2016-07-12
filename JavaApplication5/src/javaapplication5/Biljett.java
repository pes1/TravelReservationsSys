package javaapplication5;

public class Biljett {
    private int plats;
    private int pris;
    private int klass;
    private boolean mat;
    private Pair matRatt;
    private String flight;
    private String forNamn;
    private String efterNamn;
    //private int kundNummer;

    public Biljett(int plats, int klass, boolean mat, String matRatt, String flight,
            String forNamn, String efterNamn){
        this.plats = plats;
        this.pris = setPris(plats, mat, matRatt);
        this.klass = klass;
        this.mat = mat;
        if (mat)this.matRatt = matRatt;
        else this.matRatt = null;    
        this.flight = flight;
        this.forNamn = forNamn;
        this.efterNamn = efterNamn;
    }
    
    public int setPris(int plats, boolean mat, Pair matRatt){
        int biljettPris = 0;
        
        //1a eller 2a klass
        if (plats < 6) biljettPris += 20000;
        else biljettPris += 5000;
        
        if(mat) biljettPris += matRatt.getPris();
        
        return biljettPris;
    }

    public int getPlats() {
        return plats;
    }

    public int getPris() {
        return pris;
    }

    public int getKlass() {
        return klass;
    }

    public boolean isMat() {
        return mat;
    }

    public Pair getMatRatt() {
        return matRatt;
    }

    public String getFlight() {
        return flight;
    }

    public String getForNamn() {
        return forNamn;
    }

    public String getEfterNamn() {
        return efterNamn;
    }

    public void setPlats(int plats) {
        this.plats = plats;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public void setMat(boolean mat) {
        this.mat = mat;
    }

    public void setMatRatt(Pair matRatt) {
        this.matRatt = matRatt;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public void setForNamn(String forNamn) {
        this.forNamn = forNamn;
    }

    public void setEfterNamn(String efterNamn) {
        this.efterNamn = efterNamn;
    }
    
    
    
}
