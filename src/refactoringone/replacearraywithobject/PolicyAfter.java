package refactoringone.replacearraywithobject;

public class PolicyAfter {
    private final Integer number;
    private final String product;
    private final double insuredAmount;

    public PolicyAfter(Integer number, String product, double insuredAmount) {
        this.number = number;
        this.product = product;
        this.insuredAmount = insuredAmount;
    }

    public Integer getNumber() {
        return number;
    }

    public String getProduct() {
        return product;
    }

    public double getInsuredAmount() {
        return insuredAmount;
    }

    public static void main(String[] args) {
        PolicyAfter policy = new PolicyAfter(3423, "NG02", 100000);

        System.out.println("Número de póliza: " + policy.getNumber());
        System.out.println("Producto: " + policy.getProduct());
        System.out.println("Monto asegurado: " + policy.getInsuredAmount());
    }
}
