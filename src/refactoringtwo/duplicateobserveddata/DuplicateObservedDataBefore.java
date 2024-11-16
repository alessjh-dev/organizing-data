package refactoringtwo.duplicateobserveddata;

public class DuplicateObservedDataBefore {
    private String name;
    private String email;

    public DuplicateObservedDataBefore(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // Sin notificación a la interfaz
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        // Sin notificación a la interfaz
    }
}
