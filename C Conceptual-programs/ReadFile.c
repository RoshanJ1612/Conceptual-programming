#include <stdio.h>
#include <stdlib.h>
#include<fcntl.h>		//filecontroller

int main()
{

	char fname[30];
	int fd = 0,ret = 0;
	char Data[10];

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

	

	read(fd,Data,6);

	//printf("Data from the file is : %6s\n",Data);
	write(1,Data,6);
	close(fd);

	return 0;
}