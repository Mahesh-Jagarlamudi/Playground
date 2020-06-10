#include<iostream>
using namespace std;
int power(int, int);
int main()
{
  //Type your code here.
  int a,n;
  cin>>a>>n;
  cout<<"Enter the value of a\n";
  cout<<"Enter the value of n\n";
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
  return 0;
}
int power(int a,int n)
{
  if(n!=0)
    return a*power(a,n-1);
  else
    return 1;
}