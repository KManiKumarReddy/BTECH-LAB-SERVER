

#include<stdio.h>
#include<sys/types.h>
#include<string.h>
#include<unistd.h>
#include<stdlib.h>


struct Student
{
	char name[20];
	int marks[6];
};

void sread(struct Student *s)
{
	int i;
	printf("Enter the student name..\n");
	scanf("%s",s->name);
	for(i = 0; i < 6; i++)
	{
		printf("Enter the marks of Subject %d: ",i+1);
		scanf("%d",&(s->marks[i]));
	}
}

void swrite(struct Student *s)
{
        int i;
        printf("name: %s\n",s->name);
        for(i = 0; i < 6; i++)
        {
                printf("MARKS OF Subject %d: => %d\n",i+1,s->marks[i]);
        }
}

void computeResult(struct Student *s,char *result)
{
	int i;
	for(i=0;i<6;i++)
	{
		if(s->marks[i] < 35)
		{
			strcpy(result,"FAIL");
			break;
		}
	}
	if(i == 6)
	{
		strcpy(result,"PASS");
	}
}

void parent(int rpd,int wpd)
{
	struct Student s;
	char result[5];
	sread(&s);
	//swrite(&s);
	write(wpd,&s,sizeof(struct Student));
	read(rpd,&result,5*sizeof(char));
	printf("Result: %s\n",result);
	close(rpd);
	close(wpd);
	//printf("Exiting parent\n");
}

void child(int rpd,int wpd)
{
	//printf("In child...\n");
	char result[5];
	struct Student s;
	read(rpd,&s,sizeof(struct Student));
	computeResult(&s,result);
	//printf("In Child result: %s\n",result);
	//int length = strlen(result)+1;
	write(wpd,result,5*sizeof(char));
	close(rpd);
	close(wpd);
	//printf("Exiting child..\n");
}


int main()
{
	int pd1[2],pd2[2];
	pid_t p;
	pipe(pd1);
	pipe(pd2);
	p = fork();
	if(p == 0)
	{
		close(pd1[1]);
		close(pd2[0]);
		child(pd1[0],pd2[1]);
	}
	else
	{
		close(pd1[0]);
		close(pd2[1]);
		parent(pd2[0],pd1[1]);
	}
	return 0;
}
