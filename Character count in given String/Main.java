#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  int i=1;
  gets(str);
  if(strlen(str)>20)
   printf("Invalid Input");
  else{
  for(int j=0;j<strlen(str);j++){
  if(str[j]==str[j+1])
    i++;
  else{
    printf("%c%d",str[j],i);
    i=1;}
  }
  }
    
	//type your code here
}