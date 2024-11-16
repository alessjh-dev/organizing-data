package refactoringtwo.changebidirectionaltounidirectional;

public class ChangeBidirectionalToUnidirectionalAfter {
    public static void main(String[] args) {
        CustomerUnidirectional customer = new CustomerUnidirectional("Laura Martínez");
        OrderUnidirectional order = new OrderUnidirectional("O001", customer);

        System.out.println("Cliente del pedido: " + order.getCustomer().getName());
        // Ya no podemos obtener los pedidos desde el cliente
    }
}

class CustomerUnidirectional {
    private final String name;

    public CustomerUnidirectional(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class OrderUnidirectional {
    private final String number;
    private final CustomerUnidirectional customer;

    public OrderUnidirectional(String number, CustomerUnidirectional customer) {
        this.number = number;
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public CustomerUnidirectional getCustomer() {
        return customer;
    }
}
