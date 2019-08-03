#include <stdio.h>
int main() {
	int a,i,k,s=1,sum=0,l,po;
  scanf("%d",&a);
  po=a;
  while(a!=0){
  k=a%10;
    for(int j=1,s=1;j<=k;j++){
    s=s*j;l=s;
    
    } sum=sum+l;
   
    a=a/10;
    
  }
  
  if(sum==po){
  printf("Yes");
  }else
    printf("No");
	return 0;
}