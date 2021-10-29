package bai1;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person a = new Person("Mai", 16, "Female", "Sleep");
          System.out.println(a);
          Person p1 = new Person();
          p1.setname("Mai");
          p1.setage(16);
          p1.setgender("Female");
          p1.sethobby("Sleep");
          
          System.out.println(p1);
	}

}
