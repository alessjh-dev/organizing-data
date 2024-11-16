package refactoringone.selfencapsulatefield;

public class MainSelfEncapsulateField {
    public static void main(String[] args) {
        // Antes de la refactorización
        ClientBefore clientBefore = new ClientBefore();
        clientBefore.updateName("Juan Pérez");
        System.out.println("Antes - Nombre del cliente: " + clientBefore.getName());

        // Después de la refactorización
        ClientAfter clientAfter = new ClientAfter();
        clientAfter.updateName("Juan Pérez");
        System.out.println("Después - Nombre del cliente: " + clientAfter.getName());
    }
}
