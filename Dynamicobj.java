interface Movie
{
 void selectMovie();
}

class Bigcinema implements Movie
{
 public void selectMovie()
 {
  System.out.println("welcome to Bigcinemas");
  System.out.println("you selected 'Robo2.0'");
 }
}

class PVRcinema implements Movie
{
 public void selectMovie()
 {
  System.out.println("welcome to PVRcinema");
  System.out.println("you selected 'Bahubali-2'");
 }
}

class Inoxcinema implements Movie
{
 public void selectMovie()
 {
  System.out.println("welcome to Inoxcinemas");
  System.out.println("you selected 'kala'");
 }
}

class Distribute
{
 public static Movie bookmyshow(String select)
 {
    if (select.equals("Bigcinema"))
     {
       return new Bigcinema();
     }

    else if (select.equals("PVRcinema"))
     {
       return new PVRcinema();
     }
    
     else if (select.equals("Inoxcinema"))
      {
       return new Inoxcinema();
      }
     else
      {
        return null;
      }
  }
}

class Dynamicobj
{
 public static void main(String[]args)
 {
  String select;
  java.util.Scanner sc = new java.util.Scanner(System.in);
  System.out.println("available theatre");
  System.out.println("1.Bigcinemas");
  System.out.println("2.Pvrcinema");
  System.out.println("3.Inoxcinema");
  System.out.println("select theatre");
  select = sc.next();
  Movie m;
  m = Distribute.bookmyshow(select);
  m.selectMovie();
 }
}
  