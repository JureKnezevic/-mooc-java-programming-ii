
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jurek
 */
public class TodoList {

    private ArrayList<String> List;

    public TodoList() {

        List = new ArrayList<>();

    }

    public void add(String task) {

        List.add(task);

    }

    public void remove(int number) {

        List.remove(number - 1);

    }

    public void print() {

        for (int i = 0; i < List.size(); i++) {
            
            System.out.println((i+1) + ": " + List.get(i));
        }
    }
}
