#include<iostream>
using namespace std;
int main()
{
  int row,col,i,j;
  cin>>row>>col;
  int M1[row][col],M2[row][col];
  int M3[row][col];
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    { 
      cin>>M1[i][j];
    }
  }
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      cin>>M2[i][j];
    }
  }
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {  M3[i][j]=M1[i][j]+M2[i][j];
    }
  }
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {  
      cout<<M3[i][j]<<" ";
    }
    cout<<"\n";
  }
  return 0;
}