/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flygResurser;

/**
 *
 * @author User
 */
public class Flygplan {
    String name;
    int antalfirstklass;
    int antalsecondklass;
	
    public Flygplan(String name, int antalfirstklass, int antalsecondklass) {
	this.name             = name;
	this.antalfirstklass  = antalfirstklass;
        this.antalsecondklass = antalsecondklass;
}

    @Override
    public String toString() {
        return name + " " + 
                "Antal 1:a klass " + antalfirstklass + " " + 
                "Antal 2:a klass " + antalsecondklass;
    }
    
    
    
    
    
} //-- of class
