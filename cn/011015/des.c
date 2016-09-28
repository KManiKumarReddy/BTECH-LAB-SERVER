#include <stdio.h>
#include <stdlib.h>

int main(void) {
	char *plain, *key, *cipher;
	char c;
	int i = 0, j = 0, p = 100;
	plain = (char *)malloc(p);
	printf("Enter plain text : ");
	while((c = getchar())!= '\n') {
		plain[i ++] = c;
		if( i == p) {
			p = p + i/2;
			plain = (char *)realloc(plain, p);
		}
	}
	plain[i] = 0;
	int plen = i;
	p = 50;
	i = 0;
	key = (char *)malloc(p);
	printf("\nEnter key : ");
	while((c= getchar())!= '\n') {
		key[i ++] = c;
		if( i == p) {
			p = p + i/2;
			key = (char *)realloc(key, p);
		}
	}
	key[p] = 0;
	int klen = i;
	i = 0;
	cipher = malloc(plen);
	while(i < plen) {
		for(j = 0; j < klen; j ++) {
 			cipher[i] = plain[i] ^ key[j];
			i ++;
			j ++;
		}
	}
	cipher[i] = 0;
	printf("cipher text after encryption is %s \n", cipher);
	i = 0;
	while ( i < plen) {
		for( j = 0; j < klen; j ++) {
			cipher[i] = cipher[i] ^ key[j];
			i ++;
			j ++;
		}
	}
	cipher[i] = 0;
	printf("Cipher text after decryption is %s\n", cipher);
	printf("plain text is %s\n", plain);
	return 0;
}


/*
Output:
Enter plain text : mani

Enter key : 12345
cipher text after encryption is \R[X35
Cipher text after decryption is mani
plain text is mani
*/
