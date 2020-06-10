#include<iostream>
using namespace std;
int main()
{
  int row,col,i,j,sum=0;
  cin>>row>>col;
  int arr[row][col];
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      cin>>arr[i][j];
      sum+=arr[i][j];
    }
    cout<<sum<<'\n';
    sum=0;
  }
}