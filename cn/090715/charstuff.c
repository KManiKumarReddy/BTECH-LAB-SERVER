/**
 * charstuff.c
 * Performing Character Stuffing
 * Author: Mani Kumar Reddy K 13B81A0579
 * Date : 09-07-15
 */
#include <stdio.h>
#include <string.h>

#define pf printf
#define sf scanf

int main(void) {
   char a[50];
   int n, i;
   pf("Enter no. of bits: ");
   sf("%d",&n);
   pf("Enter String: ");
   for (i = 0; i < n; i ++)
     sf(" %c",&a[i]);
   pf("Entered string is %c\n",a);
   pf("STXDLE");
   for (i = 0; i < n; i ++) {
     if (a[i-3] =='D' && a[i-2] =='L' && a[i-1] =='E')
       pf("DLE");
       pf("%c", a[i]);
   }
   pf("ETXDLE\n");
   return 0;  
}
/*
[y13cseb79@fedora20 090715]$ cc charstuff.c -o charstuff
[y13cseb79@fedora20 090715]$ ./charstuff
Enter no. of bits: 10
Enter String: abcDLEDLEx
Entered string is
STXDLEabcDLEDLEDLEDLExETXDLE
 */ 
