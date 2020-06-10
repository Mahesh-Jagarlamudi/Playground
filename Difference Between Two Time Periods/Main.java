#include<iostream>
using namespace std;
int main()
{
  struct time
  {
    int hour;
    int min;
    int sec;
  }T1,T2,diff;
  cin>>T1.hour>>T1.min>>T1.sec;
  cin>>T2.hour>>T2.min>>T2.sec;
  while(T2.sec>T1.sec) {
      --T1.min;
      T1.sec+=60;
   }
   diff.sec = T1.sec-T2.sec;
   while(T2.min>T1.min) {
      --T1.hour;
      T1.min+=60;
   }
   diff.min = T1.min-T2.min;
   diff.hour = T1.hour-T2.hour;
  cout<<diff.hour<<":"<<diff.min<<":"<<diff.sec;
}