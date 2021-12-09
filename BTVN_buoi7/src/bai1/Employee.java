package bai1;
 import java.util.Scanner;
public class Employee extends Person{
    Scanner sc = new Scanner(System.in);

    private int salary;
    public Employee(){}
    public Employee(Integer salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, Integer salary) {
        super(name, address);
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public void Input(){
        System.out.println("Enter employee name: ");
        this.setName(sc.nextLine());
        System.out.println("Enter employee address : ");
        this.setAddress(sc.nextLine());
        System.out.println("Enter salary: ");
        this.setSalary(sc.nextInt());
    }
    @Override
    public void display() {
        System.out.println("Employee name: " +  this.getName());
        System.out.println("Employee address: " +  this.getAddress());
        System.out.println("Employee salary: " +  this.getSalary());

    }

}
