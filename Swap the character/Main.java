#include<stdio.h>
#include<string.h>
int main()
{
   char a[100],b[100],c[100];
  int i=0;
  scanf("%s%s%s",&a,&b,&c);
  //printf("%s%s%s",a,b,c);
   for(i=0;i<strlen(a);i++){
     if(a[i]=='a'||a[i]=='u'||a[i]=='o'||a[i]=='i'||a[i]=='e'||a[i]=='A'||a[i]=='O'||a[i]=='I'||a[i]=='E'||a[i]=='U')
       printf("$");
      else
        printf("%c",a[i]);}
     for(i=0;i<strlen(b);i++)
              if(b[i]=='a'||b[i]=='u'||b[i]=='o'||b[i]=='i'||b[i]=='e'||b[i]=='A'||b[i]=='O'||b[i]=='I'||b[i]=='E'||b[i]=='U')
            printf("%c",b[i]);
      else
             printf("#");
  for(i=0;i<strlen(c);i++){
    if(c[i]>=97)
  printf("%c",c[i]-32);
    else
      printf("%c",c[i]);
  }
  
}