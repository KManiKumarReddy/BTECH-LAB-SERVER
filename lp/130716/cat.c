#include<sys/types.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<error.h>

int main(int argc,char *argv[]){
	int fp;
	int c;
	if(argc==1){
		perror("Enter a file name\n");
		return -1;
	}
	fp=open(argv[1],O_RDONLY);
	if(fp<0){
		perror("file open error\n");
		return -1;
	}
	while(read(fp,&c,sizeof(char))>0)
		write(1,&c,sizeof(char));
	close(fp);
	return 1;
}
