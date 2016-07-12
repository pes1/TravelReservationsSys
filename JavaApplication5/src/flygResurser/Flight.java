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
    private int prisFirst;
    private int prisSecond;
    
    public Flight(String destination, String avreseort, List<Biljett> bokadeBijetter, Map<Integer, Boolean> platser, int flightNumber, int prisFirst, int prisSecond){
        this.destination = destination;
        this.avresesort = avreseort;
        this.bokadeBijetter = bokadeBijetter;
        this.platser = platser;
        this.flightNumber = flightNumber;
        this.prisFirst = prisFirst;
        this.prisSecond = prisSecond;
    }
    
    public void fyllmap() {
        for(int i=1;i<=10;i++) {
            platser.put(i,false);
        }
    }
    
    public int getPlats() {
        for(int i = 1;i<=10;i++) {
            if(platser.get(i) == false) {
                platser.put(i, true);
                return i;
            }
        }
        return 0;
    }
}