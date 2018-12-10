class Existedproject
{
 private int a,b;
 public Existedproject(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
        
    public void task1()
     {
       System.out.println("a value is : "+a);
       System.out.println("b value is : "+b);
     }
  
}  


class Fproject extends Existedproject
{
  public Fproject(int a,int b)
   {
     super(a,b);
   }
}

class Inheritech1_A
{
  public static void main(String[]args);
  Fproject f = new Fproject();
  f.task1();
}       