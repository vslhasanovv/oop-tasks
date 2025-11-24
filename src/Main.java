public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.year = 2021;
        myCar.model = "G30";
        myCar.brand = "BMW";

        System.out.println("My car is: " + myCar.year + " " + myCar.brand + " " + myCar.model    );
    }
}