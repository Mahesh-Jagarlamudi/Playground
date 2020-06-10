#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fp,fd,fs,sp,sd,ss,ap,ad,as,f,s,a;
  cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
  f = (fp-(fp*fd)/100)+fs;
  s = (sp-(sp*sd)/100)+ss;
  a = (ap-(ap*ad)/100)+as;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  if(f<=s && f<=a)
    cout<<"He will prefer Flipkart\n";
  else if(s<=f && s<=a)
    cout<<"He will prefer Snapdeal\n";
  else
    cout<<"He will prefer Amazon";
}