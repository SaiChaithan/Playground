// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,b,l=0;
  scanf("%d%d",&a,&b);
  if(a>b){
  for(int i=1;i<=b;i++){
  if(a%i==0&&b%i==0)
    l=i;
  }
  }
  else{
  for(int i=1;i<=a;i++){
  if(a%i==0 && b%i==0)
    l=i;
  }
  }
  printf("%d",l);
    
   return 0;
}