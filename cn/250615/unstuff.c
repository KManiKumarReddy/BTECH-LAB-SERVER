/*
 *      Name      :     P.Pritheesh
 *      Branch    :     CSE
 *      Roll      :     13B81A05B6
 *      Date      :     25-6-15
 *      Purpose   :     Unstuffing data
 */
#include <stdio.h>
#define pf printf
#define sf scanf

void main()
{
   int n,i=0,j=0,c=0,a[100];
   pf("Enter no. of bits in msg: ");
   sf("%d",&n);
   pf("Enter data: ");
   for(i=0;i<n;i++)
    sf("%d",&a[i]);
   
   pf("Entered stuffed stream \n");
   for(i=0;i<n;i++)
     pf("%d",a[i]);
   pf("\nUnstuffed stream\n");
   i=0;
   while(i<n)
   {
     if(a[i]==1)
        c++;
     else
        c=0;
     if(c==5)
     {
       pf("%d",a[i]);
       i++;
       c=0;
     }
     else
      pf("%d",a[i]);
     i++;
     
   }
   
}
