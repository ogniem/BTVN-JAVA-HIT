package bai1;
import java.util.Scanner;
public class Customer extends Person{

    Scanner sc = new Scanner(System.in);
    private int balance;

    public Customer(Scanner sc, int balance) {
        this.sc = sc;
        this.balance = balance;
    }

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.sc = sc;
        this.balance = balance;
    }

    public Scanner getSc() {
        return sc;
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void Input(){
        System.out.println("Enter customer name: ");
        this.setName(sc.nextLine());
        System.out.println("Enter customer address: ");
        this.setAddress(sc.nextLine());
        System.out.println("Enter customer balance: ");
        this.setBalance(sc.nextInt());
    }
    @Override
    public void display() {
        System.out.println("Customer name: " +  this.getName());
        System.out.println("Customer address: " +  this.getAddress());
        System.out.println("Customer salary: " +  this.getBalance());
    }
}
