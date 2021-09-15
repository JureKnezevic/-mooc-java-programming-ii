
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Employees {
    
    private ArrayList<Person> list;
    
    public Employees() {
        list = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        
        list.add(personToAdd);
        
    }
    
    public void add(List<Person> peopleToAdd) {
        
        peopleToAdd.stream().forEach(person -> list.add(person));
        
    }
    
    public void print() {
        
        Iterator<Person> iterator = list.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }
    
    public void print(Education education) {
        
        Iterator<Person> iterator = list.iterator();
        
        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
            
        }
        
    }
    
    public void fire(Education education) {
        
        Iterator<Person> iterator = list.iterator();
        
        while(iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
            
        }
    }
}
