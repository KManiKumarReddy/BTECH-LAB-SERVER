class Overload
{
   void test(int i)//1
   {
     System.out.println("In int");
   }
  
   void test(short s)//2
   {
     System.out.println("In short");
   }

   void test(double d)//3
   {
     System.out.println("In double");
   }

   void test(int i,double d)//4
   {
     System.out.println("In int,double");
   }
   
   void test(double d,int i)//5
   {
     System.out.println("In double,int");
   }
}

class OverloadDemo
{
   public static void main(String arg[])
   {
     short s=10;byte b=6;float f1=8.6f;
     Overload o=new Overload();
     o.test(5)
     ;
     o.test(b);
     o.test(f1);
     o.test(98l);
     //o.test(f1,f1);
     //o.test(s,s);
   }
}

