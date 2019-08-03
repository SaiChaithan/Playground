#include<stdio.h>
int main()
{
  int a=0,b=1,c;
  int d;
  scanf("%d",&d);
  printf("%d %d",a,b);
  for(int i=0;i<d-2;i++){
  c=a+b;
    printf(" %d",c);
    a=b;
    b=c;
  }
  //Type your code here
  return 0;
}