#include<iostream>
#include<math.h>
using namespace std;
//int answer(int);
int main()
{
  int n,m,req;
  cin>>n>>m>>req;
  int a=pow(n,m);
  if(a<req)
    cout<<"Sorry Doctor! You need more bacteria.";
  else
    cout<<"Doctor, you can proceed with your experiment.";
}

