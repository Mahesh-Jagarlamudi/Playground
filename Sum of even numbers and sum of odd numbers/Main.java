#include<iostream>
using namespace std;
int main()
{
  int n,evenSum=0,oddSum=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    if(arr[i]%2==0)
      evenSum+=arr[i];
    else
      oddSum+=arr[i];
  }
  cout<<"The sum of the even numbers in the array is "<<evenSum;
  cout<<"\nThe sum of the odd numbers in the array is "<<oddSum;
}