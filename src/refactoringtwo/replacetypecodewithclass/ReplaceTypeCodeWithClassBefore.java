package refactoringtwo.replacetypecodewithclass;

public class ReplaceTypeCodeWithClassBefore {
    public static void main(String[] args) {
        PolicyTypeCodeBefore policy = new PolicyTypeCodeBefore("P001", 1); // 1: Vida, 2: Auto, 3: Hogar

        System.out.println("Número de póliza: " + policy.getNumber());
        System.out.println("Tipo de póliza: " + policy.getType());
    }
}

class PolicyTypeCodeBefore {
    private final String number;
    private final int type;

    public PolicyTypeCodeBefore(String number, int type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public int getType() {
        return type;
    }
}
