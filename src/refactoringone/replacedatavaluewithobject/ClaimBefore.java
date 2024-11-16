package refactoringone.replacedatavaluewithobject;

public class ClaimBefore {
    private final String currencyCode; // "GTQ", "USD", "EUR"

    public ClaimBefore(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double calculateAmountByCurrency(double amount) {
        if (currencyCode.equals("GTQ")) {
            return amount;
        } else if (currencyCode.equals("USD")) {
            return amount / 7.85;
        } else if (currencyCode.equals("EUR")) {
            return amount / 9.50;
        } else {
            throw new IllegalArgumentException("Código de moneda desconocido.");
        }
    }
}
