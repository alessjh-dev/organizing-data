package refactoringtwo.replacesubclasswithfields;

public class ReplaceSubclassWithFieldsBefore {
    public static void main(String[] args) {
        EmployeeBefore manager = new ManagerBefore();
        EmployeeBefore engineer = new EngineerBefore();

        System.out.println("Rol del empleado 1: " + manager.getRole());
        System.out.println("Rol del empleado 2: " + engineer.getRole());
    }
}

abstract class EmployeeBefore {
    public abstract String getRole();
}

class ManagerBefore extends EmployeeBefore {
    @Override
    public String getRole() {
        return "Gerente";
    }
}

class EngineerBefore extends EmployeeBefore {
    @Override
    public String getRole() {
        return "Ingeniero";
    }
}
