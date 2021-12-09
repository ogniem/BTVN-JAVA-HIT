package bai2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    private static ArrayList<Book> books= new ArrayList<>();
    private static int n;
    private static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("+) Add book \n" +
                "1) Edit book by id \n" +
                "2) Delete book by id \n" +
                "3) Sort books by name (ascending) \n" +
                "4) Sort books by price (descending) \n" +
                "5) Show all books \n" +
                "\t\t+) Exit.\n " );
     Addbook();

    }
    private static void Addbook(){
        System.out.println("Nhập số sách: ");
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("Nhập thông tin quyển sách thứ "+(i+1));
            Book book = new Book();
            book.Input();
            books.add(book);
        }
    }
    private static void Sortbooksbyprice(Book book){
        for(int i=0; i<n; i++) {
            for(int j=n; j>i; j--) {

                }
            }
        }



}
