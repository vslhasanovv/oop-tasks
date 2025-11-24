public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.year = 2021;
        myCar.model = "G30";
        myCar.brand = "BMW";
        System.out.println("My car is: " + myCar.year + " " + myCar.brand + " " + myCar.model    );

        Student s1 = new Student("John" , 22);
        Student s2 = new Student("Jane", 23);
        Student s3 = new Student("Jane", 22);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

    }
}