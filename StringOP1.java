class StringOP1
{
 cmdpublic static void maiin(String[]args)
  {
   String s = new String("rama");
   System.out.println("before s address is:"+s.hashCode());
   s = s.concat("devi");
   System.out.println("after s is:"+s);
   System.out.println("after s address is:"+s.hashCode());

   StringBuffer sb = new StringBuffer("rama");
   System.out.println("before sb is:"+sb.hashCode());
   sb = sb.append("devi");
   System.out.println("after sb is:"+sb);
   System.out.println("after sb address is:"+sb.hashCode());
  }
}