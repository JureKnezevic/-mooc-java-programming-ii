
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
public class IOU {
    
    private HashMap<String, Double> iou;
    
    public IOU() {
        
        iou = new HashMap<>();
        
    }
    
    public void setSum(String toWhom, double amount) {
        iou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        
        if (iou.get(toWhom) == null) {
            return 0;
        }
        
        return iou.get(toWhom);
    }
    
}
