#include<iostream>
int main(){
  // Type your code here
  int n,fact=1;
  std::cin>>n;
  for(int i=n;i>=1;i--)
  {
    fact = fact * i;
  }
  std::cout<<fact;
}