package refactoringone.replacedatavaluewithobject;

public class Currency {
    private final String code;
    private static final double DOLLAR_RATE = 7.85;
    private static final double EURO_RATE = 9.50;

    public Currency(String code) {
        this.code = code;
    }

    public double convertToCurrency(double amount) {
        return switch (code) {
            case "GTQ" -> amount;
            case "USD" -> amount / DOLLAR_RATE;
            case "EUR" -> amount / EURO_RATE;
            default -> throw new IllegalArgumentException("Código de moneda desconocido.");
        };
    }
}
