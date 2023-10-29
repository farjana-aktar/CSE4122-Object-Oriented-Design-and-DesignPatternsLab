class WarehouseProxy implements IOrder {
    private Warehouse Warehouse;

    public WarehouseProxy() {
    }

    private Warehouse getRealWarehouse() {
        if (Warehouse == null) {
            Warehouse = new Warehouse();
        }
        return Warehouse;
    }

    @Override
    public void processOrder(String product, int quantity) {
        getRealWarehouse().processOrder(product, quantity);
    }

    @Override
    public int checkInventory(String product) {
        return getRealWarehouse().checkInventory(product);
    }
}

