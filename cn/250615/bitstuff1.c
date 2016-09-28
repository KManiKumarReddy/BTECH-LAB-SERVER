/*
 *     Name    :   P.Pritheesh
 *     Roll    :   13B81A05B6
 *     Date    :   25-06-15
 *     Purpose :   Bitstuffing
 */

#include <stdio.h>
#define pf printf
#define sf scanf
void main()
{
   int k=1,n,i,count=0,j=0,m=0;
   char a[30],b[30],c='a';
   pf("Enter no. of bits in data: ");
   sf("%d",&n);
   pf("Enter data: ");
   for(i=0;i<n;i++)
    sf(" %c",&a[i]);
   
   for(i=0;i<n;i++)
   {
     if(count==5)
     {
       b[j++]='$';
       m++;
       count=0;
       b[j++]=a[i];
       c=a[i+1];
       if(a[i]==c) count++;
       
     }
     else
     {
         c=a[i+1];
         b[j++]=a[i];
         if(a[i]==c) count++;
         else
           count=0;
     }
   k++;
   }
   if(count==5)
   {
        b[j++]='$';
        m++;
   }
   pf("Before stuffing \n01111110");
   for(i=0;i<n;i++)
     pf("%c",a[i]);
   pf("01111110\n");
   pf("After stuffing \n");
   pf("01111110");
   for(i=0;i<n+m;i++)
     pf("%c",b[i]);
   pf("01111110");
   pf("\n");
   
}    

