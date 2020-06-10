#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,*tickets;
  int male=0,female=0;
  cin>>n;
  tickets=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(tickets+i);
    if(*(tickets+i)%2==0)
      female++;
    else
      male++;
  }
  cout<<male<<"\n"<<female;
  return 0;
}