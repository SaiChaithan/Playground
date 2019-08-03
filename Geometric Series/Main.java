#include<stdio.h>
int main()
{
  //type your code here
  int i,n,m=1,k=1;
  scanf("%d",&n);
  for(i=0;i<n;i++){
  if(i%2==0)
  {//printf("%d",m);
    m=m*2;
  }
    else{
     // printf("%d",k);
     k=k*3;
    }
  }
  if(n%2!=0)
    printf("%d",m/2);
  else
    printf("%d",k/3);
  return 0;
}