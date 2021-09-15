

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Literacy {
    
    String country;
    int year;
    String gender;
    double percentage;
    
    public Literacy(double percentage, String country, int year, String gender) {
        this.country = country;
        this.year = Integer.valueOf(year);
        this.gender = gender;
        this.percentage = Double.valueOf(percentage);
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public Integer getYear() {
        return this.year;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public Double getPercentage() {
        return this.percentage;
    }
    

    
    
    @Override
    public String toString() {
        return getCountry() + " (" + getYear() + "), " + getGender() + ", " + getPercentage();
    }


    
}
