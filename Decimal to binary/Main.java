#include<stdio.h>
int main()
{
  //Type your code here
  int a,n,l=0,i=0;
  scanf("%d",&a);
  int m=a;
    while(m!=0){
      m=m/2;l++;}
 // printf("%d",l);
  int arr[l];
  while(a!=0){
  n=a%2;
    arr[i]=n;
    //printf("%d",n);
   a=a/2;
    i++;
  }
  for(i=l-1;i>=0;i--)
   printf("%d",arr[i]);
  return 0;
}