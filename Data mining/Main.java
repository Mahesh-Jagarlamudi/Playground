#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,digit,evenSum=0,oddSum=0;
  cin>>num;
  while(num!=0)
  {
    digit=num%10;
    if(digit%2==0)
    {
      evenSum+=digit;
    }
    else{
      oddSum+=digit;
    }
    num=num/10;
  }
    if(evenSum==oddSum)
      cout<<"Yes";
    else
      cout<<"No";
}