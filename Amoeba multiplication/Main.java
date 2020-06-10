#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num1=0,num2=1,num3,i,month;
  cin>>month;
  for(i=2;i<month;i++){
    num3=num1+num2;
    num1=num2;
    num2=num3;
  }
  cout<<num3;
}