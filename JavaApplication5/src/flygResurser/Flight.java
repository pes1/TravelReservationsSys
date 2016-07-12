package flygResurser;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import flygResurser.Biljett;

public class Flight {
    private String destination;
    private String avresesort;
    private List<Biljett> bokadeBijetter;
    private Map<Integer, Boolean> platser;
    private int flightNumber;
    
    public Flight(String destination, String avreseort, List<Biljett> bokadeBijetter, Map<Integer, Boolean> platser, int flightNumber){
        this.destination    = destination;
        this.avresesort     = avreseort;
        this.bokadeBijetter = bokadeBijetter;
        this.platser        = platser;
        this.flightNumber   = flightNumber;
    }
    
    public void fyllmap() {
        for(int i=1;i<=10;i++) {
            platser.put(i,false);
        }
    }
    
    public int getPlats() {
        return 0;
    }
}