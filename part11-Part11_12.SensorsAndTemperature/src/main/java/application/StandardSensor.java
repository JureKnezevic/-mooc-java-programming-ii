package application;

public class StandardSensor implements Sensor{
    
    private int param;
    
    public StandardSensor(int param) {
        
        this.param = param;
        
    }
    

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        
    }

    @Override
    public void setOff() {
        
    }

    @Override
    public int read() {
        return this.param;
    }
    
}
