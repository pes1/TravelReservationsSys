package flygResurser;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {
    private String destination;
    private String avresesort;
    private List<Biljett> bokadeBijetter = new ArrayList<Biljett>();
    private HashMap<Integer, Boolean> platserFirst = new HashMap<Integer, Boolean>();
    private HashMap<Integer, Boolean> platserSecond = new HashMap<Integer, Boolean>();
    private String flightNumber;
    private int prisFirst;
    private int prisSecond;
    
    public Flight(String destination, String avreseort, String flightNumber, int prisFirst, int prisSecond){
        this.destination = destination;
        this.avresesort = avreseort;
        this.flightNumber = flightNumber;
        this.prisFirst = prisFirst;
        this.prisSecond = prisSecond;
    }

    
    public void fyllmapFirst(int n) {
        for(int i=1;i<=n;i++) {
            platserFirst.put(i,false);
        }
    }
    
    public void fyllmapSecond(int n) {
        for(int i=6;i<=n+5;i++) {
            platserSecond.put(i,false);
        }
    }
    
    
            
    public int getPlatsFirst() {
        for(int i = 1;i<=5;i++) {
            if(platserFirst.get(i) == false) {
                platserFirst.put(i, true);
                return i;
            }
        }
        return 0;
    }
    
    public int getPlatsSecond() {
        for(int i = 6;i<=10;i++) {
            if(platserSecond.get(i) == false) {
                platserSecond.put(i, true);
                return i;
            }
        }
        return 0;
    }
    
    public String getFlightNo() {
        return flightNumber;
    }
    
    public List<Biljett> getBiljetter() {
        return bokadeBijetter;
    }

    public String toString(){
        return this.avresesort + " " + this.destination + " " + this.flightNumber;
    }
}
