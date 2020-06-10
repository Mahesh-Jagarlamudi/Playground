#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,count=0;
  cin>>num;
  while(num!=1){
    cout<<num<<"\n";
  	if(num%2==0){
      num=num/2;
      count++;
    }
    else
    {
      num=num*3+1;
      count++;
    }
  }
  cout<<"1\n"<<count;
  return 0;
}