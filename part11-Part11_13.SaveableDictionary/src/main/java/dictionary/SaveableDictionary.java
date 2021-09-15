/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jurek
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private HashMap<String, String> dictionary2;
    private String file;


    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.dictionary2 = new HashMap<>();
    }

    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words) || this.dictionary2.containsKey(words)) {
            this.dictionary.put(words, translation);
            this.dictionary2.put(translation, words);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary2.containsKey(word)) {
            return this.dictionary2.get(word);
        }
        return null;
    }

    public void delete(String word) {

        if (this.dictionary.containsKey(word)) {

            this.dictionary2.remove(this.dictionary.get(word));
            this.dictionary.remove(word);

        } else if (this.dictionary2.containsKey(word)) {

            this.dictionary.remove(this.dictionary2.get(word));
            this.dictionary2.remove(word);
        }

    }

    public SaveableDictionary(String file) {

        this.dictionary = new HashMap<>();
        this.dictionary2 = new HashMap<>();
        this.file = file;
    }

    public boolean load() {

        try ( Scanner fileRead = new Scanner(Paths.get(file))) {

            while (fileRead.hasNextLine()) {
                String row = fileRead.nextLine();

                String[] parts = row.split(":");

                if (!this.dictionary.containsKey(parts[0]) || this.dictionary2.containsKey(parts[0])) {
                    this.dictionary.put(parts[0], parts[1]);
                    this.dictionary2.put(parts[1], parts[0]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return true;
    }

    public boolean save() {

        try (PrintWriter writer = new PrintWriter(this.file)) {
            
            for (String key : this.dictionary.keySet()) {
                writer.println(key + ":" + this.dictionary.get(key));
            }
            writer.close();

        } catch (FileNotFoundException ex) {

            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
