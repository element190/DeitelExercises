package Chapter3;

public class ClockClassTest {
    public static void main(String[] args) {
        ClockClass clockformat = new ClockClass(23,45,56);

        System.out.printf("The time format is %n%d:%d:%d",clockformat.getHour(),clockformat.getMinute(),clockformat.getSecond());
    }
}
