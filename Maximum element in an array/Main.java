#include<iostream>
using namespace std;
int main()
{
  int a,max=-1000;
  cin>>a;
  int arr[a];
  for(int i=0;i<a;i++){
  cin>>arr[i];
    if(arr[i]>max)
      max=arr[i];
    
  }cout<<max;
  	//type your code here
}