#include<stdio.h>
int main()
{ 
  int a;
  scanf("%d",&a);
  int s=a%10;
 s=s+a/100;
  printf("%d",s);
  return 0;
}