#include<iostream>
using namespace std;
int main()
{
  int n=1,num,i=1,j,space=0,m=1,k,l;
  cin>>num;
  int number=num;
  for(i=0;i<num;i++)
  {
    for(j=1;j<=space;j++)
      cout<<"-";
    for(k=1;k<2*num-space;k++)
    {
      if(k%2==0)
        cout<<"*";
      else
        cout<<n++;
    }
    cout<<"*";
    for(l=1;l<2*num-space;l++)
    {
      if(l%2==0)
        cout<<"*";
      else
      {
        cout<<m+number*number;
  	    m++;
      }  
    }
    number--;
    space=space+2;
    cout<<"\n";
  }
}