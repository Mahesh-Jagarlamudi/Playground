#include<iostream>
using namespace std;
int main()
{
  int row,col,i,j,max;
  cin>>row>>col;
  int Mat[row][col];
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
      cin>>Mat[i][j];
  }
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      if(Mat[i][j]>max)
        max=Mat[i][j];
      else
        max=max;
    }
    cout<<max<<"\n";
    max=0;
  }
}