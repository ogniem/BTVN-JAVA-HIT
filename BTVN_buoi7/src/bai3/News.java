package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    Scanner sc= new Scanner(System.in);
    public News(){}
    public News(int id, String title, String publishDate, String author, String content, Float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Float getAverageRate() {
        return averageRate;
    }

    ArrayList<Integer> rateList= new ArrayList<>();
    public void inputRateList(){
        for(int i=0; i<3;i++){
            System.out.println("Enter rateList "+i+": ");
            rateList.add(sc.nextInt());
        }
    }

    public void Calculate(){
        int sum =0;
        for(int i=0; i<3;i++){
            sum+= rateList.get(i);
        }
        this.averageRate = (float)sum/3;
    }
    @Override
    public void Display() {
        System.out.println("Title: "+this.title);
        System.out.println("PuplishDate: "+this.publishDate);
        System.out.println("Author: "+ this.author);
        System.out.println("Content: "+this.content);
        System.out.println("AverageRate: "+this.averageRate);
    }
}
