class Employee
{
  private String id;
  private String name;
  private int age;
  private double sal;
  private static String cname = "TCS";
    
     public Employee(String id,String name,int age,Double sal)
      {
   
        this.id=id;
        this.name=name; 
        this.age=age; 
        this.sal=sal;
      }

       public void details()
        {
       
         System.out.println("emp details");
         System.out.println("=================");
         System.out.println("emp id is:"+id);
         System.out.println("emp name is:"+name);
         System.out.println("emp age is:"+age);
         System.out.println("emp salary is:"+sal);
         System.out.println("emp cname is:"+cname);
        }
   


}


 class OOPS5
    {
         public static void main(String[]args)
           {
                String id;
                String name;
                int age;
                Double sal;
         
             java.util.Scanner sc = new java.util.Scanner(System.in);
                
             System.out.println("enter id in String format");
             id = sc.next();
             System.out.println("enter name in String format");
             name = sc.next();
             System.out.println("enter age in int format");
             age = sc.nextInt();
             System.out.println("enter salary in double format");
             sal = sc.nextDouble();
          
            Employee e = new Employee(id,name,age,sal);
            e.details();
            Employee e2 = new Employee("w13","ashok",12,12200.00);
            e2.details();
            Employee e3 = new Employee("w19","ash",34,124200.00);
            e3.details();
         }
}





     
     
     
     