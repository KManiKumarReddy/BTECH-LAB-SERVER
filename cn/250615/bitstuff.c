/*
 */

#include <stdio.h>
#define pf printf
#define sf scanf

void main()
{
   int n,a[100],b[100],i,count=0,j=0,m=0;
   pf("Enter no. of bits in data: ");
   sf("%d",&n);
   pf("Enter data: ");
   for(i=0;i<n;i++)
    sf("%d",&a[i]);
   for(i=0;i<n;i++)
   {
     if(count==4)
     {
       b[j++]=0;
       m++;
       count=0;
       b[j++]=a[i];
       if(a[i]==1) count++;
     }
     else
     {
         b[j++]=a[i];
         if(a[i]==1) count++;
         else
           count=0;
     }
   }
   if(count==4)
   {
        b[j++]=0;
        m++;
   }
   pf("Before stuffing \n01111110");
   for(i=0;i<n;i++)
     pf("%d",a[i]);
   pf("01111110\n");
   pf("After stuffing \n");
   pf("01111110");
   for(i=0;i<n+m;i++)
     pf("%d",b[i]);
   pf("01111110");
   pf("\n");
   
}    

