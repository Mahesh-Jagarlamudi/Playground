#include <iostream>
using namespace std;
int main() {
  int num,i,j;
  cin>>num;
  for(i=1;i<=num;i++)
  {
    if(i%2!=0)
    {
      for(j=1;j<num;j++)
        cout<<i;
      cout<<i+1<<"\n";
    }
    else
    {
      cout<<i+1;
      for(j=1;j<num;j++)
        cout<<i;
      cout<<"\n";
    }
  }
  return 0;
}