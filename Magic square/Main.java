/*#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,sum1=0,sum2=0,sum3=0,i,j,flag=1;
  cin>>n;
  int Matrix[n][n];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>Matrix[i][j];
      if(i==j)
        sum+=Matrix[i][j];
    }
  }
  if(n==n)
  {
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      sum1+=Matrix[i][j];
      sum2+=Matrix[j][i];
      if(i+j+1==n)
      { 
        sum3+=Matrix[i][j];
      }
    }
    if(sum!=sum1&&sum2!=sum)
    {
      flag=0;
      break;
    }
    sum1=0;
    sum2=0;
  }
  }
  if(flag==1&&sum==sum3)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}*/
//                ( OR )
#include<iostream>
using namespace std;
int main()
{
  int n,Diag1=0,Diag2=0,i,j;
  cin>>n;
  int Matrix[n][n];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>Matrix[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==j)
      {
      	Diag1+=Matrix[i][j];
      }
      if(i+j+1==n)
      { 
        Diag2+=Matrix[i][j];
      }
    }
  }
  if(Diag1==Diag2)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}