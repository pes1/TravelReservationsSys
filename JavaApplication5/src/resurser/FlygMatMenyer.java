/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resurser;

/**
 *
 * @author User
 */
public class FlygMatMenyer {
    String food;
    int price;
    int klass;
    
    public FlygMatMenyer(String food, int price, int klass) {
        this.food = food;
        this.price = price;
        this.klass = klass;
    }
    
    public String getFood() {
        return food;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getKlass() {
        return klass;
    }
}
