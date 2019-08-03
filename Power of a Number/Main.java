#include <stdio.h>

int main()
{
  long int i,n,l=1;
  scanf("%ld%ld",&i,&n);
 if(n>=0){
  for(int j=0;j<n;j++)
     l=l*i;
   printf("%ld",l);}
  else
    printf("Wrong input");
  	//Your code here       
    return 0;
}