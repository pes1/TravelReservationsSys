/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resurser;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Maträtter {
    
    FlygMatMenyer p;
    List<FlygMatMenyer> first,economy;
            
    public Maträtter() {
        first = new ArrayList<FlygMatMenyer>();
        economy = new ArrayList<FlygMatMenyer>();
        
        p = new FlygMatMenyer("Oxfilé",100,1);
        first.add(p);
        p = new FlygMatMenyer("Lasagne",70,1);
        first.add(p);
        p = new FlygMatMenyer("Köttbullar",70,2);
        economy.add(p);
        p = new FlygMatMenyer("Gröt",40,2);
        economy.add(p);
    }
    
    public List<FlygMatMenyer> getMeny(int v) {
        if(v >= 1 && v <= 5) {
            return first;
        }
        else if(v >= 6 && v <= 10) {
                return economy;
        }
        return null;
    }
}
