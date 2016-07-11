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
    List<Pair> first,economy;
            
    public Food() {
        first = new ArrayList<Pair>();
        economy = new ArrayList<Pair>();
        
        p = new Pair("Oxfilé",100,1);
        first.add(p);
        p = new Pair("Lasagne",70,1);
        first.add(p);
        p = new Pair("Köttbullar",70,2);
        economy.add(p);
        p = new Pair("Gröt",40,2);
        economy.add(p);
    }
    
    public List<Pair> getMeny(int v) {
        if(v >= 1 && v <= 5) {
            return first;
        }
        else if(v >= 6 && v <= 10) {
                return economy;
        }
        return null;
    }
}
