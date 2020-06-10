#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float t,x=10.15,y=13.30,z=18.00,w=22.00;
  cin>>age>>t;
  if(age>=13)
  {
    if(t==y || t==z)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  else
  {
    if(t==y || t==z)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
}