import java.util.HashMap;
import java.util.Map;

class Warehouse implements IOrder {
    private Map<String, Integer> inventory = new HashMap<>();

    public Warehouse() {
        
        inventory.put("ProductA", 100);
        inventory.put("ProductB", 50);
    }

    @Override
    public void processOrder(String product, int quantity) {
        int availableQuantity = checkInventory(product);

        if (availableQuantity >= quantity) {
            System.out.println("Order for " + product + " (Quantity: " + quantity + ") processed successfully.");
            inventory.put(product, availableQuantity - quantity);
        } else {
            System.out.println("Insufficient inventory for " + product + ". Order not processed.");
        }
    }

    @Override
    public int checkInventory(String product) {
        return inventory.getOrDefault(product, 0);
    }
}
