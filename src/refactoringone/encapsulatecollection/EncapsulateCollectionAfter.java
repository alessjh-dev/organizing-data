package refactoringone.encapsulatecollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EncapsulateCollectionAfter {
    public static void main(String[] args) {
        AgentCollectionAfter agent = new AgentCollectionAfter("Roberto Sánchez");
        ClientCollection client1 = new ClientCollection("María Pérez");
        ClientCollection client2 = new ClientCollection("Luis Gómez");

        agent.addClient(client1);
        agent.addClient(client2);

        System.out.println("Clientes del agente:");
        for (ClientCollection client : agent.getClients()) {
            System.out.println("- " + client.getName());
        }

        // Intento de modificar la colección directamente (lanzará excepción)
        // agent.getClients().add(new ClientCollection("Nuevo Cliente"));
    }
}

class AgentCollectionAfter {
    private final String name;
    private final Set<ClientCollection> clients = new HashSet<>();

    public AgentCollectionAfter(String name) {
        this.name = name;
    }

    public void addClient(ClientCollection client) {
        clients.add(client);
    }

    public void removeClient(ClientCollection client) {
        clients.remove(client);
    }

    public Set<ClientCollection> getClients() {
        return Collections.unmodifiableSet(clients);
    }

    public String getName() {
        return name;
    }
}
