#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c,m[10][10],t[10][10];
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>m[i][j];
    }
  }
  for(int i=0;i<r;i++) {
    for(int j=0;j<c;j++) {
      t[j][i] = m[i][j];
    }
  }
  for(int i=0;i<c;i++) {
    for(int j=0;j<r;j++) {
      cout<<t[i][j]<<" ";
     if(j==r-1)
       cout<<endl;
    }
  }
}