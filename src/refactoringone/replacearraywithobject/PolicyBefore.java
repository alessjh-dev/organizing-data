package refactoringone.replacearraywithobject;

public class PolicyBefore {
    public static void main(String[] args) {
        String[] policyData = new String[3];
        policyData[0] = "87987"; // Número de póliza
        policyData[1] = "NG02"; // Producto
        policyData[2] = "100000"; // Suma asegurado

        System.out.println("Número de póliza: " + policyData[0]);
        System.out.println("Producto: " + policyData[1]);
        System.out.println("Monto asegurado: " + policyData[2]);
    }
}
