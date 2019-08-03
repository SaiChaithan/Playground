#include<iostream>
using namespace std;
int main()
{
int a,i,j,l=0;
  cin>>a;
  int arr[a];
  for(int i=0;i<a;i++){
  cin>>arr[i];
  }
  int b[2];
  cin>>b[0]>>b[1];
  for(i=0;i<2;i++){
    for(j=0;j<a;j++){
      if(arr[j]==b[i]){
           l++;break;}
}if(l!=0){
      cout<<"Element "<<i+1<<" index = "<<j<<endl;
    }
    if(l==0)
            cout<<"Element "<<i+1<<" index = "<<-1<<endl;
      l=0;
  }
}