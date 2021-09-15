
public class Cat extends Animal{
     
    public Cat(String name) {
        super(name); 
    }
    
    public Cat() {
        super("Cat");
    }
    
    public void purr() {
        System.out.println(this.name + " purrs");
    }
    
    
    public void makeNoise() {
        this.purr();
    }
}
