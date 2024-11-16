package refactoringtwo.replacetypecodewithsubclasses;

public class ReplaceTypeCodeWithSubclassesBefore {
    public static void main(String[] args) {
        PolicyTypeSubclassBefore policy = new PolicyTypeSubclassBefore("P001", 1);

        System.out.println("Prima de la póliza: " + policy.calculatePremium());
    }
}

class PolicyTypeSubclassBefore {
    private String number;
    private final int type; // 1: Vida, 2: Auto

    public PolicyTypeSubclassBefore(String number, int type) {
        this.number = number;
        this.type = type;
    }

    public double calculatePremium() {
        if (type == 1) {
            return 500; // Lógica para Vida
        } else if (type == 2) {
            return 300; // Lógica para Auto
        } else {
            return 0;
        }
    }
}
