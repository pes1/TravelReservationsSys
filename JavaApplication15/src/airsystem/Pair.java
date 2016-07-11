/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airsystem;

/**
 *
 * @author User
 */
public class Pair {
    String food;
    int price;
    int klass;
    
    public Pair(String food, int price, int klass) {
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
