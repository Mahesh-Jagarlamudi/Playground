#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,cy,by,ca;
  cin>>x>>y;
  if(x>y)
  {
    by=1900+x;
    cy=2000+y;
  	ca=cy-by;
    cout<<ca;
  } 
  else
  {
    ca=y-x;
  	cout<<ca;
  } 
}