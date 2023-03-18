package Chapter3;

public class HealthRecordTest {
    public static void main(String[] args) {
        HealthRecord client = new HealthRecord("Babajide","FARINDE",1990,10,25,"Male",45,45.5);

        //client.setYear(2000);

        System.out.println("The Client's name is " + client.getFirstName() + " " + client.getLastName());
        System.out.println("The Client's gender is "+ client.getGender());
        System.out.println("The Client's age is "+ client.getYear() + "years ");
        System.out.println("The Client's Height is "+ client.getHeight() + " in inches ");
        System.out.println("The Client's Weight is "+ client.getWeight() + " in pounds ");


        System.out.println("The Client's Maximum HeartRate is " + client.getMaximumHeartRate());

        System.out.println("The Client's Target HeartRate is " + client.getTargetHeartRate());
    }
}
