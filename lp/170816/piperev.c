#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>
void parent(int,int);
void child(int,int);
int main()
{
  int pd1[2],pd2[2];
  pid_t p;
  pipe(pd1);
  pipe(pd2);
  p=fork();
 	 if(p==0){
   	    close(pd1[1]);
   	    close(pd2[0]);
   	    child(pd1[0],pd2[1]);
  	}
 	 else{
    	    close(pd1[0]);
     	    close(pd2[1]);
    	    parent(pd1[1],pd2[0]);
  	}
}


char *strrev(char *str)
{
  char *p1, *p2;

 	 if (! *str)
	     return str;
     	 for (p1 = str, p2 = str + strlen(str) - 1; p2 > p1; ++p1, --p2){
           			*p1 ^= *p2;
           			*p2 ^= *p1;
            			*p1 ^= *p2;
      	}
  return str;
}


void child(int rpd,int wpd)
{
  char str[50];
  int len;
  len=read(rpd,str,50*sizeof(char));
  strrev(str);
  write(wpd,str,len*sizeof(char));
  close(rpd);
  close(wpd);
}

void parent(int wpd,int rpd)
{
  char s[50],len,r[50]; 
  printf("enter string:- \n");
  scanf("%s",s);
  len=strlen(s)+1;
  write(wpd,s,len*sizeof(char));
  read(rpd,r,len*sizeof(char));
  printf("reverse string:- %s\n",r);
  close(wpd);
  close(rpd);
}






