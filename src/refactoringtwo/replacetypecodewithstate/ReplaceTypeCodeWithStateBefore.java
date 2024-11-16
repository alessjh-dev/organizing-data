package refactoringtwo.replacetypecodewithstate;

public class ReplaceTypeCodeWithStateBefore {
    public static void main(String[] args) {
        PolicyTypeStateBefore policy = new PolicyTypeStateBefore("P001", 1);

        System.out.println("Prima de la póliza: " + policy.calculatePremium());
    }
}

class PolicyTypeStateBefore {
    private String number;
    private final int type; // 1: Vida, 2: Auto

    public PolicyTypeStateBefore(String number, int type) {
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
