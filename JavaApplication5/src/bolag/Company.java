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


public class Company {
   
    Flygplan        ettFlygplan;
    List<Flygplan>  flyg;
    
    public Company(Flygplan ettFlygplan) {

        this.ettFlygplan = ettFlygplan;
        flyg = new ArrayList<Flygplan>();
        flyg.add(this.ettFlygplan);

    }
    
    public List<Flygplan> getFlygplan() {
        return flyg;
    
    }
    
    public void makeProfit() {
        
    }
    
    
}
