interface Projectmanager1
{
 int a =10;// final static
 void task1();// public abstract
 void task2();//public abstract
}

interface Projectmanager2
{
 int b =20;
 void task3();
 void task4();
}

class Developer implements Projectmanager1,Projectmanager2
{
 public void task1()
 {
   System.out.println("Ronaldo is a great player");
 }
 public void task2()
 {
  System.out.println("Real madrid is the best team");
 }
 public void task3()
 {
  System.out.println("Marcelo is best lb");
 }
 
 public void task4()
  {
  System.out.println("Ramos is the best");
  }
}

class Interfacedemo
{
 public static void main(String[]args)
 {
  Projectmanager1 p1 = new Developer();
  p1.task1();
  p1.task2();
  System.out.println("you request:"+Developer.a);
  System.out.println("==========================");
  Projectmanager2 p2 = new Developer();
  p2.task3();
  p2.task4();
  System.out.println("you request:"+Developer.b);
  }
}
 