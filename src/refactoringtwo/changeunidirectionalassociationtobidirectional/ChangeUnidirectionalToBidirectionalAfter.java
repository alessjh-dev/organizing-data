package refactoringtwo.changeunidirectionalassociationtobidirectional;

import java.util.ArrayList;
import java.util.List;

public class ChangeUnidirectionalToBidirectionalAfter {
    public static void main(String[] args) {
        ClientBidirectional client = new ClientBidirectional("Carlos Gómez");
        PolicyBidirectional policy = new PolicyBidirectional("P001");

        policy.setClient(client);

        System.out.println("Cliente de la póliza: " + policy.getClient().getName());
        System.out.println("Pólizas del cliente:");
        for (PolicyBidirectional p : client.getPolicies()) {
            System.out.println("- " + p.getNumber());
        }
    }
}

class ClientBidirectional {
    private final String name;
    private final List<PolicyBidirectional> policies = new ArrayList<>();

    public ClientBidirectional(String name) {
        this.name = name;
    }

    public void addPolicy(PolicyBidirectional policy) {
        if (!policies.contains(policy)) {
            policies.add(policy);
            policy.setClient(this);
        }
    }

    public void removePolicy(PolicyBidirectional policy) {
        if (policies.contains(policy)) {
            policies.remove(policy);
            policy.setClient(null);
        }
    }

    public String getName() {
        return name;
    }

    public List<PolicyBidirectional> getPolicies() {
        return policies;
    }
}

class PolicyBidirectional {
    private final String number;
    private ClientBidirectional client;

    public PolicyBidirectional(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public ClientBidirectional getClient() {
        return client;
    }

    public void setClient(ClientBidirectional client) {
        if (this.client != null) {
            this.client.removePolicy(this);
        }
        this.client = client;
        if (client != null && !client.getPolicies().contains(this)) {
            client.addPolicy(this);
        }
    }
}
