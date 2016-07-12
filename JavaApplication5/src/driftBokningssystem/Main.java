/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driftBokningssystem;

import flygResurser.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        //-- 
/*
        flygplan1 = 
        new flygplan(int NoOfFirstClassChairs,
                 int NoOfSecondClassChairs,
                 char planeType,
                 char planeName);
        company1=
        company(char companyName, ArrayList<flygplan> listaFlygplan);

        //-- company1.addPlane(flygplan2);
        
        flight1=
        flight(frånPlats, tillPlats, flygplan1 //-- för att få antal stolar
               flightNo, prisLista);
        
        //-- flight2=
        //-- flight(frånPlats, tillPlats, flygplan1 //-- för att få antal stolar
        //--        flightNo, prisLista);
        
        booking(company1, ArrayList<flight> flight1);
        //-- Återkommer hit när bokninssystemet stängs av.......
*
*
*
*/

    Flygplan flygplan1 = new Flygplan("Nisse Viking",5,5);

        System.out.println("driftBokningssystem.Main.main()");
        System.out.println(flygplan1.toString() );
        
        Company comp = new Company();
        
        //-- bör nog initaliseras
        ArrayList<Biljett>    bokadeBijetter = new ArrayList<Biljett>();
        Map<Integer, Boolean> platser        = new Map<Integer, Boolean>;
   // public Flight(String destination, String avreseort, List<Biljett> bokadeBijetter, Map<Integer, Boolean> platser, int flightNumber){

        Flight firstFlight1;
        firstFlight1 = new Flight("LHR","ARN", bokadeBijetter, platser, 0);
//        Flight f = new Flight("LHR","ARN", "flygplan1", "LHR");
//        Flight f = new Flight("LHR","ARN", "flygplan1", "LHR");
//        Flight f = new Flight("Airbus A-320","SK1020", "ARN", "LHR");
//        Flight f = new Flight("Airbus A-321","SK1220", "ARN", "OSL");
//        Flight f = new Flight("Airbus A-321","SK1440", "ARN", "MAD");
//        Flight f = new Flight("Airbus A-320","SK4320", "ARN", "ORY");






    }
}
