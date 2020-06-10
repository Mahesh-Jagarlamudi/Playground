#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int i,j,r,c;
  cin>>r>>c;
  int m1[r][c];
  int m2[r][c],res[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cin>>m1[i][j];
  }
  //cout<<"\n";
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cin>>m2[i][j];
  }
  //cout<<"\n";
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      res[i][j]=m1[i][j] + m2[i][j];
      cout<<res[i][j]<<" ";
    }
    cout<<"\n";
  }
  //cout<<"\n";
}