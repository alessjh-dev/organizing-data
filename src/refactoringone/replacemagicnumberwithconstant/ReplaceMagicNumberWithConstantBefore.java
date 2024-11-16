package refactoringone.replacemagicnumberwithconstant;

public class ReplaceMagicNumberWithConstantBefore {
    public static void main(String[] args) {
        double coverageAmount = 200000;
        double premium = coverageAmount * 0.05; // Número mágico 0.05

        System.out.println("La prima es: " + premium);
    }
}
