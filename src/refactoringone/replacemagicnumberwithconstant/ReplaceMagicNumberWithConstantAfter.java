package refactoringone.replacemagicnumberwithconstant;

public class ReplaceMagicNumberWithConstantAfter {
    private static final double BASE_RATE = 0.05; // Tasa base del 5%

    public static void main(String[] args) {
        double coverageAmount = 200000;
        double premium = coverageAmount * BASE_RATE;

        System.out.println("La prima es: " + premium);
    }
}
