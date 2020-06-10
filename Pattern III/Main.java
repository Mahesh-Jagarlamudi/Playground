#include<iostream>
using namespace std;
int main()
{
  int i,j,num;
  cin>>num;
  for(i=1;i<=num;i++)
  {
    for(j=1;j<=i;j++)
    {  if(j<i)
        cout<<i<<"*";
      else
        cout<<i<<"\n";
    }
  }
  for(i=num;i>=0;i--)
  {
    for(j=1;j<=i;j++)
    {  
      if(j<i)
        cout<<i<<"*";
      else
        cout<<i<<"\n";
    }
  }
}