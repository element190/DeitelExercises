package Chapter3;

public class HeartRateTest {

    public static void main(String[] args) {
            HeartRate account = new HeartRate("Babajide","FARINDE",2023,10,25);

        account.setYear(1993);

        System.out.println("The Client's name is " + account.getFirstName() + " " + account.getLastName());
        System.out.println("The Client's age is "+ account.getYear() + "years ");
        System.out.println("The Client's Maximum HeartRate is " + account.getMaximumHeartRate());

        System.out.println("The Client's Target HeartRate is " + account.getTargetHeartRate());
    }
}