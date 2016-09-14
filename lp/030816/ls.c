#include <unistd.h>
#include <grp.h>
#include <sys/stat.h>
#include <pwd.h>
#include <sys/types.h>
#include <stdio.h>
#include <time.h>

char display_file_type(mode_t st_mode){
	switch(st_mode & S_IFMT){
		case S_IFDIR:
			return 'd';
		case S_IFCHR:
			return 'c';
		case S_IFBLK:
			return 'b';
		case S_IFREG:
			return '-';
		case S_IFLNK:
			return 'l';
		case S_IFIFO:
			return 'p';
	}
}

void display_access_perm(mode_t st_mode, char amode[]){
	int i, j;
	char per[] = "rwxrwxrwx";
	for(i = 0, j = (1 << 8);i < 9;j >>= 1, i++)
		amode[i] = (st_mode & j)?per[i]:'-';
	if(st_mode & S_ISUID)
		amode[2] = (amode[2] == 'x') ? 'S' : 's';
	if(st_mode & S_ISGID)
		amode[5] = (amode[5] == 'x') ? 'G' : 'g';
	if(st_mode & S_ISVTX)
		amode[8] = (amode[8] == 'x') ? 'T' : 't';
	amode[i] = 0;
}

int main(int argc, char *argv[]){
	if(argc < 2) {
		perror("Invalid number of arguments");
		return -1;
	}
	struct stat statv;
	struct group *gr_p;
	struct passwd *pw_p;
	char amode[10];
	if(lstat(argv[1], &statv)){

		perror("Invalid path name");
		return -1;
	}
	printf("%c", display_file_type(statv.st_mode));
	display_access_perm(statv.st_mode, amode);
	printf("%s ", amode);
	printf("%2d ", statv.st_nlink);
	pw_p = getpwuid(statv.st_uid);
	gr_p = getgrgid(statv.st_gid);
	printf("%s ", pw_p->pw_name);
	printf("%s ", gr_p->gr_name);
	printf("%d ", statv.st_size);
	printf("%s ", ctime(&statv.st_mtime));
	return 0;	
}
