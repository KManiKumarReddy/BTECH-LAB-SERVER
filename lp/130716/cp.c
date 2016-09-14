#include<fcntl.h>
#include<stdio.h>

int main(int argc,char *argv[]){
	int fp,fp2;
	char c;
	if(argc!=3)
		perror("Enter two file names\n");
	fp=open(argv[1],O_RDONLY);
	if(fp<0)
		perror("Enter a valid source filename\n");
	fp2=open(argv[2],O_CREAT,S_IRWXU);
	fp2=open(argv[2],O_WRONLY);
	while(read(fp,&c,sizeof(char)>0))
		write(fp2,&c,sizeof(char));
	close(fp);
	close(fp2);
	write(1,"Successfully copied......\n",sizeof(char)*26);
	return 0;
}
