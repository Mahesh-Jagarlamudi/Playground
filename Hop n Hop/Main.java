#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  //Type your code here.
  int x2,y2,res;
  int x1=3,y1=4;
  cin>>x2>>y2;
  res = sqrt(pow(x2 - x1, 2) +  pow(y2 - y1, 2) * 1.0); 
  cout<<res;
}