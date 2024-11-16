package refactoringtwo.replacetypecodewithstate;

public class ReplaceTypeCodeWithStateAfter {
    public static void main(String[] args) {
        PolicyTypeStateAfter lifePolicy = new PolicyTypeStateAfter("P001", new LifePolicyType());
        PolicyTypeStateAfter autoPolicy = new PolicyTypeStateAfter("P002", new AutoPolicyType());

        System.out.println("Prima de póliza de vida: " + lifePolicy.calculatePremium());
        System.out.println("Prima de póliza de auto: " + autoPolicy.calculatePremium());
    }
}

class PolicyTypeStateAfter {
    private final String number;
    private final PolicyTypeStrategy policyType;

    public PolicyTypeStateAfter(String number, PolicyTypeStrategy policyType) {
        this.number = number;
        this.policyType = policyType;
    }

    public double calculatePremium() {
        return policyType.calculatePremium(this);
    }

    public String getNumber() {
        return number;
    }
}

interface PolicyTypeStrategy {
    double calculatePremium(PolicyTypeStateAfter policy);
}

class LifePolicyType implements PolicyTypeStrategy {
    @Override
    public double calculatePremium(PolicyTypeStateAfter policy) {
        return 500;
    }
}

class AutoPolicyType implements PolicyTypeStrategy {
    @Override
    public double calculatePremium(PolicyTypeStateAfter policy) {
        return 300;
    }
}
