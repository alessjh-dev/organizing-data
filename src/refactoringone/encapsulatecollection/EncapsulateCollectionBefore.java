package refactoringone.encapsulatecollection;

import java.util.HashSet;
import java.util.Set;

public class EncapsulateCollectionBefore {
    public static void main(String[] args) {
        AgentCollectionBefore agent = new AgentCollectionBefore("Roberto Sánchez");
        ClientCollection client1 = new ClientCollection("María Pérez");
        ClientCollection client2 = new ClientCollection("Luis Gómez");

        agent.clients.add(client1);
        agent.clients.add(client2);

        System.out.println("Clientes del agente:");
        for (ClientCollection client : agent.clients) {
            System.out.println("- " + client.getName());
        }
    }
}

class AgentCollectionBefore {
    public String name;
    public Set<ClientCollection> clients = new HashSet<>();

    public AgentCollectionBefore(String name) {
        this.name = name;
    }
}

class ClientCollection {
    private final String name;

    public ClientCollection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
