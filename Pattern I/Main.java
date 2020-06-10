#include<iostream>
using namespace std;
int main()
{
  int n=3,num,i,j;
  cin>>num;
  for(i=1;i<=n+1;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<num;
    }
    num++;
    cout<<"\n";
  }
  num--;
  for(i=n+1;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      cout<<num;
    }
    num--;
    cout<<"\n";
  }
  return 0;
}