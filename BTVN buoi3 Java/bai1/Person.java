package bai1;

public class Person {
 private String name;
 private int age;
 private String gender;
 private String hobby;

 public Person() {}
public Person (String name, int age, String gender, String hobby) {
	
	this.name = name;
	this.age = age;
	this.gender= gender;
	this.hobby = hobby;
}

public void setname(String name) {
	this.name = name;
}

public void setage(int age) {
	this.age = age;
}

public void setgender(String gender) {
	this.gender = gender;
}

public void sethobby(String hobby) {
	this.hobby = hobby;
}

public String getname()
{
	return name;
}

public int getage()
{
	return age;
}

public String getgender()
{
	return gender;
}

public String gethobby()
{
	return hobby;
}
@Override
public String toString() {
	return "Person{ "+ name + ", age = " + age + ", gender: " + gender + ", hobby: "+ hobby + "}";
}
}
