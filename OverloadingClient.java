class Development
{
 private int a,b;
 public Development(int a ,int b)
  {
   this.a=a;
   this.b=b;
  }

 public void task()
  {
    int res = a+b;
    System.out.println("the result is :"+res);
  }

 public void task( int x,int y,int z)
  {
    int res = x+y+z;
    System.out.println("updated result:"+res);
  }
 
 public void task(int x)
  {
    System.out.println("again updated result:"+Math.sqrt(x));
  }

}
class OverloadingClient
{
 public static void main(String[]args)
  {
    Development d = new Development(10,20);
    d.task();
    d.task(11,22,33);
    d.task(5);
  }
}