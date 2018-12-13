abstract class Projectmanager
{
 public void task1();
 {
  
 }

public abstract void task2();
 {
  //abstarct method
 }
}

class Developer extends Projectmanager
{
 public void task1();
 {
  System.out.println("task-1 is completed");
 }

 public void task2();
 {
  System.out.println("task-2 is completed");
 }

}

class Client2
{
 public static void main(String[]args)
 {
   Projectmanager p = new Developer();
   p.task1();
   p.task2();
  }
}