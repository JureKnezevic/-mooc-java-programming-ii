/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class CD implements Packable{
    
    private String artist;
    private String title;
    private int year;
    private double weight;
    
    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
        
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.artist + ": " + this.title +  " (" + this.year + ")";
    }
    
}
