
package edu.ecommerce;

public class Order {
    private String orderId;
    private String customerName;
    private double total;

    public class OrderItem {
        private String productName;
        private double price;
        private int quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.total = 0;
    }

    public double hitungTotal(OrderItem[] items) {
        total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("RINCIAN PESANAN");
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);
        System.out.printf("%-20s %-12s %-8s %-15s\n", "Produk", "Harga", "Qty", "Subtotal");

        for (OrderItem item : items) {
            System.out.printf("%-20s Rp %-9.0f %-8d Rp %-12.0f\n",
                    item.getProductName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getSubtotal());
        }
        System.out.printf("TOTAL PESANAN : Rp %.0f\n", total);
    }
}