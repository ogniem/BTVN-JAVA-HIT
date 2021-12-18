package Bai1;

import java.util.*;
import java.util.Scanner;
public class RunMain {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n;
      System.out.println("Enter number person: ");
      n= sc.nextInt();
      List<Person> person = new ArrayList<>();
      for(int i=0; i<n; i++){
         Person p = new Person();
         System.out.println("Enter person"+(i+1)+": ");
         p.Input();
         person.add(p);

      }

      System.out.println("Sort by ID: ");
      Collections.sort(person);
      for (Person p : person) {
         System.out.println(person.toString());
      }

      System.out.println("Sort by NAME:");
      Collections.sort(person, new Comparator<Person>() {
         @Override
         public int compare(Person o1, Person o2) {
            int cmpName=o1.getName().compareTo(o2.getName())
                    , cmpAdd=o2.getAddress().compareTo(o1.getAddress());
            return cmpName!=0 ? cmpName : cmpAdd;

         }
      });

      System.out.println(person);
   }

}

