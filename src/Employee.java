public class Employee {
    String name;
    double salary;
    Address address;

    Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    void showEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address.city + " , " + address.street + " , " + address.zipcode);
    }
}
