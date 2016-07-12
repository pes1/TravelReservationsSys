package flygResurser;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {
    private String destination;
    private String avresesort;
    private List<Biljett> bokadeBijetter = new ArrayList<Biljett>();
    private HashMap<Integer, Boolean> platser = new HashMap<Integer, Boolean>();
    private int flightNumber;
    private int prisFirst;
    private int prisSecond;
    
    public Flight(
            String                    destination, 
            String                    avreseort, 
            List<Biljett>             bokadeBijetter, 
            HashMap<Integer, Boolean> platser, 
            int                       flightNumber, 
            int                       prisFirst, 
            int                       prisSecond)
    {
        this.destination    = destination;
        this.avresesort     = avreseort;
        this.bokadeBijetter = bokadeBijetter;
        this.platser        = platser;
        this.flightNumber   = flightNumber;
        this.prisFirst      = prisFirst;
        this.prisSecond     = prisSecond;
    }

    
    public void fyllmap() {
        for(int i=1;i<=10;i++) {
            platser.put(i,false);
        }
    }
    
    public int getPlatsFirst() {
        for(int i = 1;i<=5;i++) {
            if(platser.get(i) == false) {
                platser.put(i, true);
                return i;
            }
        }
        return 0;
    }
    
    public int getPlatsSecond() {
        for(int i = 6;i<=10;i++) {
            if(platser.get(i) == false) {
                platser.put(i, true);
                return i;
            }
        }
        return 0;
    }
}
