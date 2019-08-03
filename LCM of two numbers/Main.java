#include<stdio.h>
int main()
{
  int a,b,i=0;
  scanf("%d%d",&a,&b);
  for(i=1;i<=a*b;i++){
  if(i%a==0&&i%b==0){
  break;
  }
  }
  printf("%d",i);
  //Type your code here
  return 0;
}