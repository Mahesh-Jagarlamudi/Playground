#include<iostream>
int main()
{
  int n1,n2;
  std::cin>>n1>>n2;
  if(n1<n2)
    std::cout<<n1<<" is smallest number";
  else
    std::cout<<n2<<" is smallest number";
}