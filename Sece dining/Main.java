#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[50];
  int rail;
  cin>>str>>rail;
  if((strcmp(str,"front")==0))
  {
    if(rail==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(rail==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}