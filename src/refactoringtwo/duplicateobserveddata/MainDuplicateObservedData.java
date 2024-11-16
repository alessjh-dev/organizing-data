package refactoringtwo.duplicateobserveddata;

public class MainDuplicateObservedData implements Observer {
    private final DuplicateObservedDataAfter client;

    public MainDuplicateObservedData(DuplicateObservedDataAfter client) {
        this.client = client;
        client.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Ventana actualizada:");
        System.out.println("Nombre: " + client.getName());
        System.out.println("Email: " + client.getEmail());
    }

    public static void main(String[] args) {
        // Antes de la refactorización
        DuplicateObservedDataBefore clientBefore = new DuplicateObservedDataBefore("Ana López", "ana.lopez@example.com");
        clientBefore.setName("Ana García");
        // Sin actualización de interfaz

        // Después de la refactorización
        DuplicateObservedDataAfter clientAfter = new DuplicateObservedDataAfter();
        new MainDuplicateObservedData(clientAfter);

        clientAfter.setName("Ana López");
        clientAfter.setEmail("ana.lopez@example.com");
    }
}
