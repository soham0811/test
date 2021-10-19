package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> hm;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        hm = new HashMap<Furniture, Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        hm.put(type,furnitureCount );
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return hm;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
      float cost = 0.0;
        for(Map.Entry m : hm.entrySet()){    
            cost = cost +m.getValue());    
           }  
           return cost;
    }

    public int getTypeCount(Furniture type) {
        int count = 0;
        for(Map.Entry m : hm.entrySet()){    
            count++;    
           }  
           return count;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return hm.get(type);
    }

    public int getTotalOrderQuantity() {
        int tcount = 0;
        for(Map.Entry m : hm.entrySet()){    
            tcount = tcount + m.getValue();
           }  
           return tcount;
    }
}
