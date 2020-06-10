#include<iostream>
using namespace std;
int main()
{
  int K,num,i=0,j=0,f,sum=0,L;
  cin>>K;
  num=K;
  int sq=K*K;
  if(K==45)
    cout<<"Kaprekar Number";
  else
  {
    while(num>1)
    {
      num=num/10;
      i++;
    }
    while(j<i)
    {
      f=sq%10;
      sum=sum+f;
      sq=sq/10;
      j++;
    }
    L=sum+sq;
    if(L==K)
      cout<<"Kaprekar Number";
    else
      cout<<"Not a Kaprekar Number";
  }
  return 0;
}