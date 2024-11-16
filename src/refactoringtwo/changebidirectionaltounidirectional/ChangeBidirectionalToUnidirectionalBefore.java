package refactoringtwo.changebidirectionaltounidirectional;

import java.util.ArrayList;
import java.util.List;

public class ChangeBidirectionalToUnidirectionalBefore {
    public static void main(String[] args) {
        CustomerBidirectional customer = new CustomerBidirectional("Laura Martínez");
        OrderBidirectional order = new OrderBidirectional("O001", customer);

        System.out.println("Cliente del pedido: " + order.getCustomer().getName());
        System.out.println("Pedidos del cliente:");
        for (OrderBidirectional o : customer.getOrders()) {
            System.out.println("- " + o.getNumber());
        }
    }
}

class CustomerBidirectional {
    private final String name;
    private final List<OrderBidirectional> orders = new ArrayList<>();

    public CustomerBidirectional(String name) {
        this.name = name;
    }

    public void addOrder(OrderBidirectional order) {
        if (!orders.contains(order)) {
            orders.add(order);
            order.setCustomer(this);
        }
    }

    public void removeOrder(OrderBidirectional order) {
        if (orders.contains(order)) {
            orders.remove(order);
            order.setCustomer(null);
        }
    }

    public String getName() {
        return name;
    }

    public List<OrderBidirectional> getOrders() {
        return orders;
    }
}

class OrderBidirectional {
    private final String number;
    private CustomerBidirectional customer;

    public OrderBidirectional(String number, CustomerBidirectional customer) {
        this.number = number;
        setCustomer(customer);
    }

    public String getNumber() {
        return number;
    }

    public CustomerBidirectional getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerBidirectional customer) {
        if (this.customer != null) {
            this.customer.removeOrder(this);
        }
        this.customer = customer;
        if (customer != null && !customer.getOrders().contains(this)) {
            customer.addOrder(this);
        }
    }
}
