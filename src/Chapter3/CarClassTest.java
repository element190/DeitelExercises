package Chapter3;

public class CarClassTest {
    public static void main(String[] args) {
        CarClass car1 = new CarClass("serena","2003",9000.45);
        CarClass car2 = new CarClass("matrix","2007", 12000.45 );

        car1.setDiscount(0.05);
        car2.setDiscount(0.07);


        System.out.printf("%s balance : %.2f%n", car1.getModel(),car1.getPrice());
        System.out.printf("%s balance : %.2f%n", car2.getModel(),car2.getPrice());
    }
}
