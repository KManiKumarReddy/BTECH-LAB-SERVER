#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
void parent(int);
int child(int);
int Prime(int);
int main()
{
  int pd[2];
  pid_t p;

 	 if(pipe(pd)<0){
    		 perror("unable to create pipe");
    		 exit(1);
  	}
	
  p=fork();

 	 if(p==0){
   	      close(pd[1]);
              child(pd[0]);
  	}

 	 else{
   	     close(pd[0]);
   	     parent(pd[1]);
 	}
}

void parent(int wpd)
{
  int c,i;
  printf("enter number");
  scanf("%d",&c);

 	 for(i=2;i<=c;i++){
     		 write(wpd,&i,sizeof(int));
   	}
	
  close(wpd);
}

int child(int rpd)
{
  int p;
 	while(read(rpd,&p,sizeof(int))){
     		 if(Prime(p)==1)
     		 printf("%d is prime\n",p);
   	}

  close(rpd);
}

int Prime(int p)
{
  int i;
	for ( i = 2 ; i <= p - 1 ; i++ ){
		if ( p%i == 0 )
		return 0;
	}

	if ( i == p )
	return 1;
}
