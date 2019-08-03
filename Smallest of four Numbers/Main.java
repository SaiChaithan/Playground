#include<stdio.h>

int main()
{
  // Type your code here
  int arr[4];
  long int max=100000000000;
  for(int i=0;i<4;i++){
    scanf("%d",&arr[i]);
    if(max>arr[i])
      max=arr[i];
  }
  printf("%d",max);
}