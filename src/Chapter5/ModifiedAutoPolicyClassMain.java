package Chapter5;

public class ModifiedAutoPolicyClassMain {
    public static void main(String[] args) {

        ModifiedAutoPolicyClass policy1 =
                new ModifiedAutoPolicyClass(11111111, "Toyota Camry", "VT");

        ModifiedAutoPolicyClass policy2 =
              new ModifiedAutoPolicyClass(22222222, "Ford Fusion","ME");

         policyInNoFaultState(policy1);
         policyInNoFaultState(policy2);
        }
 public static void policyInNoFaultState(ModifiedAutoPolicyClass policy) {
         System.out.println("The auto policy:");
         System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                 policy.getAccountNumber(), policy.getMakeAndModel(),
                 policy.getState(),
                 (policy.isNoFaultState() ? "is": "is not"));
    }
}
