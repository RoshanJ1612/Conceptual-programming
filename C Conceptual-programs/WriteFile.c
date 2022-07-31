#include <stdio.h>
#include <stdlib.h>
#include<fcntl.h>		//filecontroller

int main()
{

	char fname[30];
	int fd = 0,ret = 0;
	char Data[110];

	printf("Enter the file name that you want to open\n");
	scanf("%s",fname);

	fd = open(fname,O_RDWR);

	if(fd == -1)
	{
		printf("Unable to open the file\n");
		return -1;
	}
	else
	{
		printf("File is sucessfully opened with fd : %d\n",fd);
	}

	printf("Enter the data that you eant to write in the file\n");
	scanf("%s",Data);
	ret = write(fd,Data,10);
	if(ret == 0)
	{
		printf("Unable to write in the file\n");
	}
	else
	{
		printf("sucessfully written in the file\n");
	}

	return 0;
}