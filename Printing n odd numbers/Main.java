#include <stdio.h>
int main() {
int n;
  scanf("%d",&n);
 for(int i=1,j=0;i<=100&&j<n;i++){
   if(i%2==1){
 j++;
     printf("%d\n",i);
 }}
	return 0;
}