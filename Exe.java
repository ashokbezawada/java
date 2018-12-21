interface ProjectDesign
{
 public void task1();
}

class ProjectImp implements ProjectDesign
{
 public void task1()
 {
   int a,b,c;
   java.util.Scanner sc = new java.util.Scanner(System.in);
   System.out.println("enter a,b,c:");
   a = sc.nextInt();
   b = sc.nextInt();
   c = sc.nextInt();
  
  try
    {
      int res = (a+b)/c;
      System.out.println("your res:"+res);
    }

 catch(ArithmeticException ae)
 {
   System.out.println("enter c value greater than 0");
 }
 }
}

class Exe
{
  public static void main(String[]args)
  {
   ProjectDesign p = new ProjectImp();
   p.task1();
  }
}