#include<iostream>
using namespace std;
int main(){
int a,l=0,i;
  cin>>a;
  int arr[a];
  for( i=0;i<a;i++)
    cin>>arr[i];
  int b;cin>>b;
  for(i=0;i<a;i++)
    if(arr[i]==b){
      l++;break;}
    if(l==0)
      cout<<b<<" isn't present in the array.";
  else
    cout<<i+1;
}