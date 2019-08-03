#include <stdio.h>
int main() {
	int a,s=1,i;
  scanf("%d",&a);
  for(i=1;i<=a;i++){
    s=s*i;
  }printf("%d",s);
	return 0;
}