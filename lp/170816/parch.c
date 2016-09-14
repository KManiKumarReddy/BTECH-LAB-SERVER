#include<stdio.h>
#include<sys/types.h>

void parent(int);
void child(int);
int isprime(int);

int main() {
  int pd[2];
  pid_t p;
  if(pipe(pd) < 0)
  p=fork();
  if(p == 0) {
    close(pd[1]);
    child(pd[0]);
  }
  else {
    close(pd[0]);
    parent(pd[1]);
  }
}

void parent(int wpd) {
  int i,n;
  printf("enter a number");
  scanf("%d",&n);
  for(i=2;i<=n;i++)
    write(wpd,&i,sizeof(int));
  close(wpd);
}

void child(int rpd) {
  int p;
  while(read(rpd,&p,sizeof(int))) {
    if(isprime(p))
      printf("%d",p);
  }
  close(rpd);
}

int isprime(int n) {
  int i;
  for(i = 2; i <= n/2; i+= 2)
    if(n % i == 0)
      return 0;
  return 1;
}		
