package refactoringtwo.changereferencetovalue;

public class MainChangeReferenceToValue {
    public static void main(String[] args) {
        Address addressClient1 = new Address("Calle 1", "Ciudad A", "12345");
        Address addressClient2 = new Address("Calle 1", "Ciudad A", "12345");

        Client client1 = new Client("Juan", addressClient1);
        Client client2 = new Client("María", addressClient2);

        // Modificar la dirección de client1
        client1.getAddress().setStreet("Calle 2");

        System.out.println("Dirección de client1: " + client1.getAddress().getStreet());
        System.out.println("Dirección de client2: " + client2.getAddress().getStreet());
    }
}
