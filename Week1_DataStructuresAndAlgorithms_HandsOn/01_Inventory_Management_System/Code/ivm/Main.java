package ivm;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Keyboard", 50, 799.00);
        Product p2 = new Product(102, "Mouse", 100, 399.00);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayInventory();

        manager.updateProduct(101, 40, 749.00);
        manager.deleteProduct(102);

        manager.displayInventory();
    }
}

