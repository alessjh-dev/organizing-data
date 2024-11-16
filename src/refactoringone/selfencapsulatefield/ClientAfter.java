package refactoringone.selfencapsulatefield;

public class ClientAfter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    public void updateName(String newName) {
        setName(newName);
    }
}
