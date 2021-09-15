package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private List<Integer> reads;

    public AverageSensor() {

        this.sensors = new ArrayList<>();
        this.reads = new ArrayList<>();

    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        
        return reads;
    }

    @Override
    public boolean isOn() {
        int i = 0;
        while (i < sensors.size()) {
            if (!sensors.get(i).isOn()) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override
    public void setOn() {
        for (int i = 0; i < sensors.size(); i++) {
            sensors.get(i).setOn();
        }
    }

    @Override
    public void setOff() {
        for (int i = 0; i < sensors.size(); i++) {
            sensors.get(i).setOff();
        }
    }

    @Override
    public int read() {
        
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        
        int avg = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < sensors.size(); i++) {
            sum = sum + sensors.get(i).read();
            count++;
        }
        avg = sum / count;
        reads.add(avg);
        
        return avg;
    }

}
