/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driftBokningssystem;

import bolag.Company;
import flygResurser.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ui.Bokning;


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
        
 
*
*
*
*/

    Flygplan flygplan1 = new Flygplan("Nisse Viking",5,5);

        System.out.println(flygplan1.toString() );
        
        Company comp = new Company(flygplan1);
        
        ArrayList<Flight> flightList = new ArrayList<Flight>();
        
        int fplats;
        
        Flight firstFlight1;
       
        firstFlight1 = new Flight("LHR","ARN", "BK1223", 20000, 5000);
        flightList.add(firstFlight1);
        
        firstFlight1.fyllmapFirst(flygplan1.getSeatFirst());
        firstFlight1.fyllmapSecond(flygplan1.getSeatSecond());
        

        
        flightList.add(firstFlight1);

        
        
        
        Bokning bokningsSystemetBlåFlyg = new Bokning(flightList);
       
        //bokningsSystemetBlåFlyg.generateBiljetter();
        bokningsSystemetBlåFlyg.meny();
    }
}
