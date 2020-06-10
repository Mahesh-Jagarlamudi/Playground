#include<iostream>
using namespace std;
int ArrayType(int n,int *arr)
{
  int even=0,odd=0;
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
      even++;
    }
    else
      odd++;
  }
  if(even==n)
    return 1;
  else if(odd==n)
    return 2;
  else
    return 3;
}
int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int arr[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>arr[i];
  int res=ArrayType(n,arr);
  if(res==1)
    cout<<"\nThe array is Even";
  else if(res==2)
    cout<<"\nThe array is Odd";
  else
    cout<<"\nThe array is Mixed";
  return 0;
}