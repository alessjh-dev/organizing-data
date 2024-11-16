package refactoringone.replacedatavaluewithobject;

public class MainReplaceDataValueWithObject {
    public static void main(String[] args) {
        // Antes de la refactorización
        ClaimBefore claimBefore = new ClaimBefore("USD");
        double amountBefore = claimBefore.calculateAmountByCurrency(100);
        System.out.println("Antes - Monto en dólares: " + amountBefore);

        // Después de la refactorización
        Currency euro = new Currency("USD");
        ClaimAfter claimAfter = new ClaimAfter(euro);
        double amountAfter = claimAfter.calculateAmountByCurrency(100);
        System.out.println("Después - Monto en dólares: " + amountAfter);
    }
}
