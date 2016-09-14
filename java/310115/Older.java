import java.util.*;
class Person
{
   int id,age;
   Person(int x,int y)
   {
     id=x;
     age=y;
   }
}

class Older
{
   public static void main(String arg[])
   {
     int p,q,old=0;
     Person P[]=new Person[2];
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<2;i++)
     {
        System.out.println("Enter the id and age of the person"+(i+1));
        p=sc.nextInt();
        q=sc.nextInt();
        P[i]=new Person(p,q);
     }
    System.out.println("The id of the older person is ");
    if(P[0].age>P[1].age)
     System.out.println(P[0].id);
    else
     System.out.println(P[1].id);
   
   }
}
    
  
