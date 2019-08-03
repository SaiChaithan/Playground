#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int s=a%10;
  while(a>10)
    a=a/10;
  printf("%d",a+s);
  
	return 0;
}