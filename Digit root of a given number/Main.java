#include<iostream>
using namespace std;
int sum(int n);
int main()
{
  int n;
  cin>>n;
  cout<<sum(n);
}
int sum(int n)
{
  if(n==0)
    return 0;
  else if(n%9==0)
    return 9;
  else
    return n%9;
}
    