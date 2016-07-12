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
    
    public Flight(){
        
    }
}
