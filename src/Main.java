import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        //first task
        Car myCar = new Car();
        myCar.year = 2021;
        myCar.model = "G30";
        myCar.brand = "BMW";
        System.out.println("My car is: " + myCar.year + " " + myCar.brand + " " + myCar.model    );

        //second task
        Student s1 = new Student("John" , 22);
        Student s2 = new Student("Jane", 23);
        Student s3 = new Student("Jane", 22);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        //third task
        Book b1 = new Book("Java Basics", "James Gosling", 45.99  );
        Book b2 = new Book("OOP Concepts", "John Doe");
        Book b3 = new Book();

        System.out.println(b1.title + " - " + b1.author + " - " + b1.price);
        System.out.println(b2.title + " - " + b2.author + " - " + b2.price);
        System.out.println(b3.title + " - " + b3.author + " - " + b3.price);

        //fourth task

        Person p = new Person();

        p.setName("John");
        p.setHeight(185);

        p.personInfo();

        // fifth task

        Engine eng = new Engine(250);

        CarWithEngine car = new CarWithEngine(eng);

        car.startCar();

        // sixth task

        Rectangle a = new Rectangle(3,5);

        System.out.println("Area: " + a.getArea());
        System.out.println("Perimeter: " + a.getPerimeter());


        // seventh task

        Address addr1 = new Address("Nizami street", "Baku", "AZ1000");
        Address addr2 = new Address("28 May Ave.", "Baku", "AZ1022");

        Employee employee1 = new Employee("John", 2000, addr1);
        Employee employee2  = new Employee("James", 2500, addr2);

        employee1.showEmployeeDetails();
        employee2.showEmployeeDetails();

    }
}