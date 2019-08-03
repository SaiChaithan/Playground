#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100];
  int k=1;
  gets(str);
  for(int i=0;i<strlen(str);i++)
  if(str[i]==' ')
    k++;
  printf("%d",k);
}