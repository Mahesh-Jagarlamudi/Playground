#include<iostream>
#include<cstring>
using namespace std;
void strrev(char * str) 
{
 int j = 0, i = 0;
 while(str[j+1]) j++;
 while(i < j) 
{
  char temp = str[i];
  str[i] = str[j];
  str[j] = temp;
  i++;
  j--;
}
}
int main()
{
  char str1[50],str2[50];
  cin>>str1>>str2;
  strrev(str1);
  if(strcmp(str1,str2)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}