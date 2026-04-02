package edu.ecommerce;

import edu.ecommerce.Order.OrderItem;

public class MainApp {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "Budi Santoso");

        OrderItem[] items = {
                order.new OrderItem("Laptop Asus ROG", 15000000, 1),
                order.new OrderItem("Mouse Logitech", 250000, 2),
                order.new OrderItem("Keyboard Mechanical", 750000, 1)
        };

        order.hitungTotal(items);
        order.tampilkanRincian(items);
    }
}
