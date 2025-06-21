package sorting;
class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Name: " + customerName + ", Price: ₹" + totalPrice;
    }
}
class OrderSorter {
    // Bubble Sort
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }
}

public class OrderSorting {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 299.99),
            new Order(102, "Bob", 499.50),
            new Order(103, "Charlie", 199.75),
            new Order(104, "Diana", 799.00)
        };

        // Bubble Sort
        System.out.println("Bubble Sort (Ascending by Total Price):");
        OrderSorter.bubbleSort(orders);
        for (Order o : orders) {
            System.out.println(o);
        }

        // Resetting for Quick Sort
        orders = new Order[]{
            new Order(101, "Alice", 299.99),
            new Order(102, "Bob", 499.50),
            new Order(103, "Charlie", 199.75),
            new Order(104, "Diana", 799.00)
        };

        // Quick Sort
        System.out.println("\nQuick Sort (Ascending by Total Price):");
        OrderSorter.quickSort(orders, 0, orders.length - 1);
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
