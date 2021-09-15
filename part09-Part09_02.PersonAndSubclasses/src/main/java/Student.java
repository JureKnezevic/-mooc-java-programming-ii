/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Student extends Person {
    
    private int credits = 0;
    
    public Student(String name, String address) {
        super(name, address);
        
        
    }
    
    public void study() {
        
        this.credits++;
    }
    
    public int credits() {
        
        return this.credits;
    }
    
    public String toString() {
        
        return super.toString() + "\n" + "  " + "Study credits " + this.credits;
    }
    
}
