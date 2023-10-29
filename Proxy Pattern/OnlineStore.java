public class OnlineStore {
    public static void main(String[] args) {
        IOrder warehouse = new WarehouseProxy();

        warehouse.processOrder("ProductA", 20);
        warehouse.processOrder("ProductB", 60);
        warehouse.processOrder("ProductC", 10);

        int availableQuantity = warehouse.checkInventory("ProductA");
        System.out.println("Available Quantity of ProductA: " + availableQuantity);
    }
}
