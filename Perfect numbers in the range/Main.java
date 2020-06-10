#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0;
  cin>>a>>b;
  for(int i=a; i<=b; i++){
    int p=1;
    while(p<=(i/2)){
      if(i % p == 0)
        sum=sum+p;
         p++;
    }
    if(sum==i)
      printf("%d ",i);
      sum=0;
   }
}
