package refactoringtwo.replacetypecodewithclass;

public class ReplaceTypeCodeWithClassAfter {
    public static void main(String[] args) {
        PolicyTypeCodeAfter policy = new PolicyTypeCodeAfter("P001", PolicyTypeCodeAfter.LIFE);

        System.out.println("Número de póliza: " + policy.getNumber());
        System.out.println("Tipo de póliza: " + policy.getType().getName());
    }
}

class PolicyTypeCodeAfter {
    public static final PolicyType LIFE = new PolicyType("Vida");
    public static final PolicyType AUTO = new PolicyType("Auto");
    public static final PolicyType HOME = new PolicyType("Hogar");

    private final String number;
    private final PolicyType type;

    public PolicyTypeCodeAfter(String number, PolicyType type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public PolicyType getType() {
        return type;
    }
}

class PolicyType {
    private final String name;

    public PolicyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
