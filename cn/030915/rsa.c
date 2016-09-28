/**
 * rsa.c
 *
 * Mani Kumar Reddy Kancharla 13B81A0579
 *
 * 03-09-2015
 */

#include <stdio.h>
#include <math.h>

int prime(int n) {
  int i;
  for (i = 2; i <= n/2; i ++)
    if (n % i == 0)
      return 0;
  return 1;
}

int ce(int phi, int p, int q, int *d) {
  // Calculating e
  int e, temp;
  for (e = 2; e < phi; e ++)
    if(prime(e) && phi % e && p != e && q != e)
      if(temp = cd(e, phi)) {
        *d = temp;
        return e;
      }
  return 0;
}

int cd(int e, int phi) {
  int d;
  for (d = 2; d < phi; d ++)
    if ((e * d) % phi == 1 && e != d)
      return d;
  return 0;
}

int main(void) {
  int p, q, n, phi, e, d, m, c, t;
  printf ("\n\nEnter two prime numbers : ");
  scanf ("%d %d", &p, &q);
  if (!prime(p) || !prime(q)) {
    printf("\nWrong input. Try again.");
    return 1;
  }
  n = p * q;
  phi = (p - 1) * (q - 1);
  
  
  
  /*
  printf("\nEnter appropriate public key : ");
  scanf("%d", &e); 
  */

  //Input
  printf("\nEnter message(between 1 & %d) : ", n);
  scanf("%d", &m);

  // Encryption
  c = pow(m, e);
  c %= n;
  printf ("\nEncrypted message is %d", c);
  
  // Calculating private key
  for (d = 2; d < phi; d ++)
    if ((e * d) % phi == 1 && e != d)
      break;
  
  if (d == phi) {
    printf("\nCalculating private key failed. Try again");
    return 1;
  } else {
    printf("\nPrivate key is %d", d);
  }
  
  // Decrypting
  t = pow(c, d);
  t %= n;
  printf ("\nDecrypted message is %d", t);
 
  // Thats all folks :) 
  return 0;
}
