
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    
    private ChangeHistory test = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        
        super(productName, capacity);
        addToWarehouse(initialBalance);
 
        
    }
    
    @Override
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
        this.test.add(this.balance);
        
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        this.test.add(this.balance);
        
        return amount;
    }
    
    public String history() {
        
        return String.valueOf(test);
        
    }
    
    public void printAnalysis() {
        
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + test.maxValue());
        System.out.println("Smallest amount of product: " + test.minValue());
        System.out.println("Average: " + test.average());
        
    }
    
}
