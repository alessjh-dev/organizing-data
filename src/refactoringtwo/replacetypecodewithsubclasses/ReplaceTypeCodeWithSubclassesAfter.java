package refactoringtwo.replacetypecodewithsubclasses;

public class ReplaceTypeCodeWithSubclassesAfter {
    public static void main(String[] args) {
        PolicyTypeSubclassAfter lifePolicy = new LifePolicy("P001");
        PolicyTypeSubclassAfter autoPolicy = new AutoPolicy("P002");

        System.out.println("Prima de póliza de vida: " + lifePolicy.calculatePremium());
        System.out.println("Prima de póliza de auto: " + autoPolicy.calculatePremium());
    }
}

abstract class PolicyTypeSubclassAfter {
    protected String number;

    protected PolicyTypeSubclassAfter(String number) {
        this.number = number;
    }

    public abstract double calculatePremium();

    public String getNumber() {
        return number;
    }
}

class LifePolicy extends PolicyTypeSubclassAfter {
    public LifePolicy(String number) {
        super(number);
    }

    @Override
    public double calculatePremium() {
        return 500;
    }
}

class AutoPolicy extends PolicyTypeSubclassAfter {
    public AutoPolicy(String number) {
        super(number);
    }

    @Override
    public double calculatePremium() {
        return 300;
    }
}
