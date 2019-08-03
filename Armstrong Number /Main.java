#include <stdio.h>
int main() {
	int a,s=0,i,k,m;
  scanf("%d",&a);
  m=a;
  for(i=1;i<=m;i++){
  k=a%10;
    s=s+(k*k*k);
    a=a/10;
  }
  if(s==m)
       printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");

  
	return 0;
}