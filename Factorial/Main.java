#include<stdio.h>
long int fact(int n){
if(n==0)
  return 1;
return n*fact(n-1);
}
int main()
{
 long int i;
  scanf("%ld",&i);
  printf( "%ld",fact(i));
    
	//your code here
}