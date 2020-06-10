#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,m,flag=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) {
    cin>>a[i];
    //cout<<" ";
  }
  cin>>m;
  for(int i=0;i<n;i++)
  {
    if(m==a[i])
    {
      flag = 1;
      break; 
    }
  }
  if(flag == 1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";

 //cout<<"She failed";
  
}