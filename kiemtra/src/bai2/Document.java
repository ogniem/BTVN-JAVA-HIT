package bai2;

import java.util.Scanner;

public class Document {
    protected String id;
    protected String name;
    protected String publisher;
    protected Integer price;
    public Document(){}

    public Document(String id, String name, String publisher, Integer price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }
    public void Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id= sc.nextLine();
        System.out.println("Enter name: ");
        this.name= sc.nextLine();
        System.out.println("Enter publisher: ");
        this.publisher= sc.nextLine();
        System.out.println("Enter price: ");
        this.price= sc.nextInt();
    }
    public void Output(){
        System.out.printf("%20s %20 %20s %20d", id, name, publisher, price);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
