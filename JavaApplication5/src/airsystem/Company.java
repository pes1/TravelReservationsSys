/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javaapplication5.Flight;

/**
 *
 * @author User
 */
public class Company {
    
    List<Flight> fly;
    Pair p;
    List<Pair> mat;
    //List<
            
    //Map<Integer,boolean> platser;
    
    public Company() {
        
        Food food = new Food();
        
        fly = new ArrayList<Flight>();
        
      /*  Flight f = new Flight( "LHR", "ARN","SK1020", "ARN",);
        fly.add(f);
        Flight f = new Flight("OSL","ARN", "ARN", "OSL");
        fly.add(f);
        Flight f = new Flight("Airbus A-321","SK1440", "ARN", "MAD");
        fly.add(f);
        Flight f = new Flight("Airbus A-320","SK4320", "ARN", "ORY");
        fly.add(f);*/
        
       //kommentar
    }
    
    public List<Flight> getFlights() {
        return fly;
    }
    
    
}
