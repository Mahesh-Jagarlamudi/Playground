#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char string1[50],string2[50];
  cin>>string1>>string2;
  if(strcmp(string1,string2)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}