#include<stdio.h>
#include<math.h>
int main()
{
  int a,n=1,m=0,i,l=0,k=0;
  scanf("%d",&a);
  
  
  while(a!=0){
  for(i=0;i<=2;i++){
  n=a%10;
  
    if(n==1){
          m=m+pow(2,i);
       //   printf("%d   ",pow(2,i));

    }
     //  printf("%d   ",pow(2,i));

    a=a/10;
   }
    l=l+m*pow(10,k);
    k++;
    m=0;
  
  }printf("%d",l);
}