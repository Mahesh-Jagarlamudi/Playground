#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,sum=0;
  cin>>num;
  int num1=num;
  while(num>0)
  {
    sum=sum+num%10;
    num=num/10;
  }
  if(num1%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}