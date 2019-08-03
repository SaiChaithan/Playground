#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long int a,n,m=0,i=0;
  int sum=0;
  scanf("%li",&a);
  while(a!=0)
  {
   n=a%10; 
    if(n==1)
    sum=sum+pow(2,i);
  //  printf("%d",sum);
    i++;
  a=a/10;
  }printf("%d",sum);
  return 0;
}