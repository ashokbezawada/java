class Test
{
 public void task1(int x , int y)
 {
  int res = x+y;
  System.out.println("your res:"+res);
 }

 public int task2(int x ,int y)
 {
  int res = x+y;
  return res;
 }
}

class Impnote
{
 public static void main(String[]args)
 {
  Test t = new Test();
  t.task1(10,20);
  System.out.println("your res:"+t.task2(100,200));
  int res3 = t.task2(555,666);
  System.out.println("your result:"+res3);
 }
}
