package refactoringone.encapsulatefield;

public class MainEncapsulateField {
    public static void main(String[] args) {
        // Antes de la refactorización
        PolicyBefore policyBefore = new PolicyBefore();
        policyBefore.coverageAmount = 100000;
        System.out.println("Antes - Monto de cobertura: " + policyBefore.coverageAmount);

        // Después de la refactorización
        PolicyAfter policyAfter = new PolicyAfter();
        policyAfter.setCoverageAmount(100000);
        System.out.println("Después - Monto de cobertura: " + policyAfter.getCoverageAmount());
    }
}
