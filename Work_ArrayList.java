import java.util.ArrayList;
class Work_ArrayList
{
 public static void main(String[]args)
 {
  ArrayList<String> al = new ArrayList<String>();
  System.out.println("before al is :"+al);
  al.add("rama@gmail.com");
  al.add("ashok@gmail.com");
  al.add("chai@gmail.com");
  System.out.println("after al is:"+al);
  al.add(1,"siva@gmail.com");
  System.out.println("after al is:"+al);
  al.remove(3);
  System.out.println("after al is:"+al);
   
  String id;
  java.util.Scanner sc = new java.util.Scanner(System.in);
  System.out.println("enter id which is in cfw");
  id = sc.next();
    if(al.contains(id))
    {
      System.out.println("Login sucess");
      System.out.println("welcome");
    }
    
    else
    {
     System.out.println("Login fail");
    }
 
  System.out.println("count no.of id's:"+al.size());
  System.out.println("===================================");


  }
}