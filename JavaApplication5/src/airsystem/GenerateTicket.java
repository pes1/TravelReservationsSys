/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airsystem;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GenerateTicket {
    
    public void meny() {
        Company comp = new Company();
        Scanner sc = new Scanner(System.in);
        int flightval;
        int seat;
        List<Pair> p;
        
        System.out.println("Biljettbokning");
        //FlightsArray f = comp.getFlights();
       // for(int i =0;i < f.length();i++) {
         //   System.out.println(f.getFlight());
        //}
        
        System.out.println("Ange nummer för flight");
        flightval = sc.nextInt();
        
        System.out.println("Ange vilken plats Första klass 1 - 5 och ekonomiklass 6 - 10");
        seat = sc.nextInt();
        
        Food food = new Food();
        
        p = food.getMeny(seat);
        System.err.println("food " + p.get(0).getFood());
        
    }
    
    public static void main(String[] args) {
        GenerateTicket gt = new GenerateTicket();
        gt.meny();
    }
}
