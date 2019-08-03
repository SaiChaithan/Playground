#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  for(int i=0;i<strlen(str);i++){
  if(str[i]=='u'||str[i]=='o'||str[i]=='i'||str[i]=='e'||str[i]=='a'||str[i]=='A'||str[i]=='O'||str[i]=='I'||str[i]=='E'||str[i]=='U')
         continue;
   else
     printf("%c",str[i]);
  }
  
  
  return 0;
}