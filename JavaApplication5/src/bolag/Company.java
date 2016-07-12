/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolag;

import flygResurser.Flygplan;
import resurser.Maträtter;
import resurser.FlygMatMenyer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Company {
   
    Flygplan        ettFlygplan;
    List<Flygplan>  flyg;

//    List<Flight> fly;
//    FlygMatMenyer p;
//    List<FlygMatMenyer> mat;
    
    public Company(Flygplan ettFlygplan) {

        this.ettFlygplan = ettFlygplan;
        flyg = new ArrayList<Flygplan>();
        flyg.add(this.ettFlygplan);
//        Maträtter food = new Maträtter();
        
//        fly = new ArrayList<Flight>();
//        
//        Flight f = new Flight("Airbus A-320","SK1020", "ARN", "LHR");
//        fly.add(f);
//        Flight f = new Flight("Airbus A-321","SK1220", "ARN", "OSL");
//        fly.add(f);
//        Flight f = new Flight("Airbus A-321","SK1440", "ARN", "MAD");
//        fly.add(f);
//        Flight f = new Flight("Airbus A-320","SK4320", "ARN", "ORY");
//        fly.add(f);
        
       //kommentar
    }
    
//    public List<Flight> getFlights() {
//        return fly;
    public List<Flygplan> getFlygplan() {
        return flyg;
    
    }
    
    
}
