package flygResurser;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {
    private String destination;
    private String avresesort;
    private List<Biljett> bokadeBijetter;
    private HashMap<Integer, Boolean> platser;
    private int flightNumber;
    
    public Flight(){
        bokadeBijetter = new ArrayList<Biljett>();
        
    }

    //public getLedigaPlatser(){}
    
    public String getDestination() {
        return destination;
    }

    public String getAvresesort() {
        return avresesort;
    }

    public List<Biljett> getBokadeBijetter() {
        return bokadeBijetter;
    }

    public Map<Integer, Boolean> getPlatser() {
        return platser;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAvresesort(String avresesort) {
        this.avresesort = avresesort;
    }

    public void setBokadeBijetter(List<Biljett> bokadeBijetter) {
        this.bokadeBijetter = bokadeBijetter;
    }

    public void setPlatser(HashMap<Integer, Boolean> platser) {
        this.platser = platser;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    
}
