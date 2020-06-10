#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str1[100];
  std::cin>>str1;
  std::cout<<int(str1[0])+int(str1[strlen(str1)-1])-96;
}