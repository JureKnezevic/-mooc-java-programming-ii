
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jurek
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> plates = new HashMap<>();
    
        

    public boolean add(LicensePlate licensePlate, String owner) {

        if (plates.get(licensePlate) != null) {

            return false;

        }

        plates.put(licensePlate, owner);

        if (plates.get(licensePlate) == null) {

            return true;
        }

        return true;
    }

    public String get(LicensePlate licensePlate) {

        return plates.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {

        if (plates.containsKey(licensePlate)) {
            plates.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        
        for (LicensePlate a : this.plates.keySet()) {
            System.out.println(a);
        }

    }

    public void printOwners() {
        
        ArrayList<String> owners = new ArrayList<>();
        
        for (LicensePlate a : this.plates.keySet()) {
            if (!owners.contains(plates.get(a))) {
                owners.add(plates.get(a));
            }
        }
        
        for (int i = 0; i < owners.size(); i++) {
            System.out.println(owners.get(i));
        }

    }

}
