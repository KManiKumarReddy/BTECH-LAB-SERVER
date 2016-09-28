/**
 * crc.c
 *
 * Performing Cyclic Redundancy Check to verify
 * if there are errors in message.
 *
 * Author : Mani Kumar Reddy K 13B81A0579
 * Date : 23-07-2015
 */

#include<stdio.h>
int main(){
	int a[30],b[30],c[30],i=0,j=0,k=0,n,m,l,count=0;
	printf("enter the size of data word");
	scanf("%d",&n);
	printf("enter the size of codeword");
	scanf("%d",&m);
	printf("enter data");
	for(i=0;i<n;i++)
		scanf(" %d",&a[i]);
	printf("enter code word");
	for(i=0;i<m;i++)
		scanf(" %d",&b[i]);
	k=m+n-1;
	for(i=n;i<k;k++)
		a[i]=0;
	for(i=0;i<m;i++){
		if(a[i]==b[i])
			c[i]=0;
		else
			c[i]=1;
	}
	do{
		i++;
		c[i]=a[i];
		for(j=0;j<m;j++){
			if(c[j]==b[j])
				c[j]=0;
			else
				c[j]=1;
		}
	}while(i<k);
	for(l=0;l<m-1;l++){
		if(c[l]==c[l+1])
			count++;
		else
			break;
	}
		if(count==m-2)
			printf("msg is error free");
		else
			printf("msg have errors");
}
