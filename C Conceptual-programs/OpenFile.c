#include <stdio.h>
#include <stdlib.h>
#include<fcntl.h>		//filecontroller

int main()
{

	char fname[30];
	int fd = 0;

	printf("Enter the file name that you want to open\n");
	scanf("%s",fname);

	fd = open(fname,O_RDWR);

	if(fd == -1)
	{
		printf("Unable to open the file\n");
	}
	else
	{
		printf("File is sucessfully opened with fd : %d\n",fd);
	}

	return 0;
}