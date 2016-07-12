/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driftBokningssystem;

import flygResurser.Flygplan;

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


    }
}
