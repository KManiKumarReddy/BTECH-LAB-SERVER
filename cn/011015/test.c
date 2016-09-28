#include <stdio.h>
#include <stdlib.h>

int main(void) {
  unsigned long long *l = malloc(sizeof(unsigned long long));
  unsigned long long int i = 1;
  while(i)
  {
    l = realloc(l, sizeof(unsigned long long) * i);
     i *= 10;
  }
  return 0;
}
