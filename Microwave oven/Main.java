#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,w,a;
  float y,z;
  cin>>x;
  cin>>y;
  if(x<=2)
 {
    z=y+(y/2);
    cout<<fixed<<setprecision(2)<<z;
 }
  else if(x==3)
  {
    w=y*2;
    cout<<w;
  }
  else
  {
    cout<<"Number of items is more";
  }
}