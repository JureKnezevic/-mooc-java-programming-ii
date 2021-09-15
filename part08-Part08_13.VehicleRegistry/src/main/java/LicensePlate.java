
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    
    @Override
    public boolean equals(Object object) {
        
        if (this.toString().equals(object.toString())) {
            return true;
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.liNumber);
        hash = 97 * hash + Objects.hashCode(this.country);
        return hash;
    }
    
    

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    
    

}
