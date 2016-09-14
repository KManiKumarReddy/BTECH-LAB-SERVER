#include<fcntl.h>
#include<stdio.h>

int get_num(char *arr){
	int num=0,i=0;
	while(arr[i]!='\0')
		num=num*10+arr[i++]-'0';
	return num;
}

int main(int argc,char *argv[]){
	int fp,lines;
	char c;
	if(argc!=3)
		perror("Enter the correct parameters\n");
	fp=open(argv[1],O_RDONLY);
	if(fp<0)
		perror("Error in opening file\n");
	lines=get_num(argv[2]);
	printf("%d",lines);
	lseek(fp,-2*sizeof(char),SEEK_END);
	while(lines>0&&(read(fp,&c,sizeof(char)))>0){
		//printf("%c",c);
		if(c=='\n')
			lines--;
		lseek(fp,-2*sizeof(char),SEEK_CUR);
	}
	while(read(fp,&c,sizeof(char))>0)
		write(1,&c,sizeof(char));
	close(fp);
	return 0;
}
