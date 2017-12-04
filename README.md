import java.util.*;
class Sai
{
public static void main(String args[])
{
int age;
long phone;
String name;
Scanner s=new Scanner(System.in);
System.out.println("Enter the student details");
System.out.println("age");
age=s.nextInt();
System.out.println("phone");
phone=s.nextLong();
System.out.println("name");
name=s.next();
System.out.println("the details of the students are");
System.out.println("Name="+name);
System.out.println("Age="+age);
System.out.println("Phone="+phone);
}
}
