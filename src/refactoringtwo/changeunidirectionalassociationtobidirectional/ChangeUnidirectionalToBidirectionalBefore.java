package refactoringtwo.changeunidirectionalassociationtobidirectional;

public class ChangeUnidirectionalToBidirectionalBefore {
    public static void main(String[] args) {
        ClientUnidirectional client = new ClientUnidirectional("Carlos Gómez");
        PolicyUnidirectional policy = new PolicyUnidirectional("P001", client);

        System.out.println("Cliente de la póliza: " + policy.getClient().getName());
        // No es posible obtener las pólizas desde el cliente
    }
}

class ClientUnidirectional {
    private final String name;

    public ClientUnidirectional(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class PolicyUnidirectional {
    private final String number;
    private final ClientUnidirectional client;

    public PolicyUnidirectional(String number, ClientUnidirectional client) {
        this.number = number;
        this.client = client;
    }

    public String getNumber() {
        return number;
    }

    public ClientUnidirectional getClient() {
        return client;
    }
}
