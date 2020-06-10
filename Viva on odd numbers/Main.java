#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,count=0;
  float score=0;
  do{
    cin>>n;
    if(n%2!=0){
      score+=1.0;
      count++;
    }
    else if(n<0){
      score-=1.0;
      break;
    }
    else if(n%2==0){
      score-=0.5;
    }
  }while(count<3);
  cout<<fixed<<setprecision(1)<<score;
}