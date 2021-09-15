/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Person {
    
    private String name;
    private Education ed;
    
    public Person(String name, Education ed) {
        
        this.name = name;
        this.ed = ed;
        
    }
    
    public Education getEducation() {
        
        return ed;
    }
    
    
    @Override
    public String toString() {
        
        return this.name + ", " + this.ed;
        
    }
    
}
