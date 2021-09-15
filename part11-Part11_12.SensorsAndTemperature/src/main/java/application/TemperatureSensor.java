package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    
    private int state;
    
    public TemperatureSensor() {
        
        this.state = 0;
    }

    @Override
    public boolean isOn() {
        if (this.state == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.state = 1;
    }

    @Override
    public void setOff() {
        this.state = 0;
    }

    @Override
    public int read() {
        if (this.state == 1) {
            int reading = new Random().nextInt(61) - 30;
            return reading;
        }
        throw new IllegalStateException();  
    }   
}