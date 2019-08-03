#include<stdio.h>
#include<stdlib.h>
int main(int arg,char *argv[])
{
  float a;
  scanf("%f",&a);
//  printf("%f",a);
  a=a/2;
  a=a*3.14*a;
  printf("%.2f",a);
  return 0;
}