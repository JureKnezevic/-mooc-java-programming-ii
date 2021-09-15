
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
public class Abbreviations {

    private HashMap<String, String> hash;

    public Abbreviations() {

        hash = new HashMap<>();

    }

    public void addAbbreviation(String key, String value) {

        hash.put(key, value);

    }

    public boolean hasAbbreviation(String search) {

        if (hash.containsKey(search)) {
            return true;
        }

        return false;
    }

    public String findExplanationFor(String search) {

        return hash.get(search);
    }

}
