package refactoringtwo.replacesubclasswithfields;

public class ReplaceSubclassWithFieldsAfter {
    public static void main(String[] args) {
        EmployeeAfter manager = new EmployeeAfter(EmployeeAfter.MANAGER);
        EmployeeAfter engineer = new EmployeeAfter(EmployeeAfter.ENGINEER);

        System.out.println("Rol del empleado 1: " + manager.getRole());
        System.out.println("Rol del empleado 2: " + engineer.getRole());
    }
}

class EmployeeAfter {
    private final String role;

    public static final String MANAGER = "Gerente";
    public static final String ENGINEER = "Ingeniero";

    public EmployeeAfter(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
