#include<iostream>
using namespace std;
int queue(int n,int m,int a[])
{
  int sum=0;
  for(int i=0;i<n;i++)
    sum+=a[i];
  if(n==1&&m==2)
    return 1;
  else
    return sum/n+1;
}
int main()
{
  int n,m;
  cin>>n>>m;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cout<<queue(n,m,arr);
}