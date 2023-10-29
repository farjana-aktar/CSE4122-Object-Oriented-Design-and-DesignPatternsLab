interface IOrder {
    void processOrder(String product, int quantity);
    int checkInventory(String product);
}
