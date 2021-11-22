package bai2;

import java.util.Scanner;

public class Book extends Document{
    private Integer numberOfPage;
    private String author;

    public Book(){}

    public Book(String id, String name, String publisher, Integer price, Integer numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numberOfPage: ");
        this.numberOfPage= sc.nextInt();
        System.out.println("Enter author: ");
        this.author=sc.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.printf("%20d %20s\n", numberOfPage, author);
    }

    public Integer getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(Integer numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
