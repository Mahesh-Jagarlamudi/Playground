#include<iostream>
using namespace std;
int main()
{
  int row,col,i,j,max,sum=0,C=0,R=0;
  cin>>row>>col;
  int Mat[row][col];
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
      cin>>Mat[i][j];
  }
  cout<<"Sum of rows is ";
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      sum+=Mat[i][j];
    }
    if(sum>max)
    {   max=sum;
        R=i;
    }
      else
      {
        max=max;
      }
    cout<<sum<<" ";
    sum=0;
  }
  cout<<"\nRow "<<R+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  max=0;
  for(i=0;i<col;i++)
  {
    sum=0;
    for(j=0;j<row;j++)
    {
      sum+=Mat[j][i];
    }
    if(sum<=max)
    {   
      max=max;
      C=i;
    }
    else
    {
        max=sum;
        C=i+1;
    }
    cout<<sum<<" ";
  }
  cout<<"\nColumn "<<C<<" has maximum sum";
}