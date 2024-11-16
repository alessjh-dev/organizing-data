package refactoringtwo.changereferencetovalue;

public class Client {
    private String name;
    private final Address address;

    public Client(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
