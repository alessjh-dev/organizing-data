package refactoringone.replacedatavaluewithobject;

public class ClaimAfter {
    private final Currency currency;

    public ClaimAfter(Currency currency) {
        this.currency = currency;
    }

    public double calculateAmountByCurrency(double amount) {
        return currency.convertToCurrency(amount);
    }
}
