class VoterID extends Exception
{
 public VoterID()
 {
  super();
 }

 public void task1()
 {
  int age;
  String name;
  java.util.Scanner sc = new java.util.Scanner(System.in);
  System.out.println("enter age:");
  age = sc.nextInt();
  System.out.println("enter name:");
  name = sc.next();
  System.out.println("Details");
  System.out.println("==========================");
  System.out.println("age is:"+age);
  System.out.println("name is:"+name);
  System.out.println("===========================");
  
  if(age<18)
  {
   try
   {
     VoterID v = new VoterID();
     throw v;
   }
   
   catch(VoterID v)
   {
    System.out.println("he/she is not eligible");
   }
  }
 }
}

class OnlineShop extends Exception
{
 public OnlineShop(String str)
 {
  super(str);
  System.out.println("str");
 }
 public void task2()
 {
   int numitem;
   java.util.Scanner sc = new java.util.Scanner(System.in);
   System.out.println("enter number of items");
   numitem = sc.nextInt();
   System.out.println("details");
   System.out.println("====================================");
   System.out.println("Selected items:"+numitem);
   System.out.println("====================================");
 
   if(numitem<10)
   {
    try
     {
       OnlineShop o=new OnlineShop("Sorry you are not eligible for discount");
       throw o;
     }
    catch(OnlineShop o)
     {
     }
    }
   
   else
    {
     System.out.println("Great you are elgible for 30% discount");
    }
   }
 }
 

class Userexp
{
 public static void main(String[]args)
 {
   VoterID v=new VoterID();
   v.task1();
   OnlineShop o = new OnlineShop("  ");
   o.task2();
 }
}