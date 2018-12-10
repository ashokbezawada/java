class A
{
 private int a,b,c;
 public A()
  {
    a=10;
    b=20;
  }
 public A(int a,int b,int c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
  }
 public void task1()
  {
    System.out.println("a value is :+a");
    System.out.println("b value is :+b");
  }
 public void task2()
  {
     System.out.println("a value is :+a");
     System.out.println("b value is :+b");
     System.out.println("c value is :+c");
  }
}


class B extends A
 {
   public B()
    {
     super();
    }
   public B(int a,int b,int c)
    {
     super(a,b,c);
    }
 }


class Inherittech1_B
 {
   public static void main(String[]args)
   {
     B b = new B();
     b.task1();
     B b2 = new B(11,22,33);
     b2.task2();
   }
 }    
      
       