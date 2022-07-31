#include <stdio.h>
#include <stdlib.h>
#include<fcntl.h>		//filecontroller

int main()
{

	char fname[30];
	int fd = 0;

	printf("Enter the file name that you eant to create\n");
	scanf("%s",fname);

	fd = creat(fname,0777);

	if(fd == -1)
	{
		printf("Unable to create the file\n");
	}
	else
	{
		printf("File is sucessfully created with fd : %d\n",fd);
	}

	return 0;
}