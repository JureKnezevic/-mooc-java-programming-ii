/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Book {
    
    String name;
    int age;
    
    public Book(String name, int age) {
        
        this.name = name;
        this.age = age;
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public Integer getAge() {
        return this.age;
    }
    
    @Override
    public String toString() {
        return getName() + " (recommended for " + getAge() + " year-olds or older)";
    }
     
}
