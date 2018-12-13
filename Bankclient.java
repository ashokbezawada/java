abstract class Bankproject
{
 private int regno;
 private final static int gst = 3;
  public Bankproject(int regno)
  {
   this.regno=regno;
  }
  
  public void your_regno()
   {
     System.out.println("your regno is :"+regno);
   }

  public abstract void Openaccount();
  public abstract void Intrest();
  
  public final static void your_gst()
   {
     System.out.println("the gst is : "+gst);
   }
}
class Icicibank extends Bankproject
{
  public Icicibank(int regno)
   {
     super(regno);
   }
   
  public void Openaccount()
   {
     System.out.println("welcome to Icicibank");
     System.out.println("to get benefits please open account in Icici bank");
   }

  
  public void Intrest()
  {
   System.out.println("loan from Icicibank is 3%");
  }
}


class Hdfcbank extends Bankproject
{
 public Hdfcbank(int regno)
 {
   super(regno);
 }
 public void Openaccount()
   {
     System.out.println("welcome to Hdfcbank");
     System.out.println("to get benefits please open account in Hdfc bank");
   }

  
  public void Intrest()
  {
   System.out.println("loan from Hdfcbank is 10%");
  }
}

class Bankclient
{
 public static void main(String[]args)
 {
  Bankproject b1= new Icicibank(1111);
  b1.your_regno();
  b1.Openaccount();
  b1.Intrest();
  Icicibank.your_gst();
 
  
  Bankproject b2= new Hdfcbank(9999);
  b2.your_regno();
  b2.Openaccount();
  b2.Intrest();
  Hdfcbank.your_gst();
 }

}

 