#include<iostream>
using namespace std;
int main()
{
  int n,j=6,sum=5;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<j<<" ";
    j=j+sum;
    sum=sum+5;
  }
}