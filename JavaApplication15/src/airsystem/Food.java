/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Food {
    
    Pair p;
    List<Pair> mat;
            
    public Food() {
        mat = new ArrayList<Pair>();
        
        p = new Pair("Oxfilé",100,1);
        mat.add(p);
        p = new Pair("Lasagne",70,1);
        mat.add(p);
        p = new Pair("Köttbullar",70,2);
        mat.add(p);
        p = new Pair("Gröt",40,2);
        mat.add(p);
    }
    
    public void getMeny(int v) {
        if(v >= 1 && v <=5) {
            System.out.println("1. Oxfile   100");
            System.out.println("2. Lasagne   70");
        }
        else if(v >= 6 && v <= 10) {
            System.out.println("1. Köttbullar   70");
            System.out.println("2. Gröt   40");
        }
        
    }
}
