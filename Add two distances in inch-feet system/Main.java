#include<iostream>
using namespace std;
int main()
{
  struct dis
  {
    int feet;
    float inch;
  }d1,d2,SumOfDist;
  cin>>d1.feet>>d1.inch>>d2.feet>>d2.inch;
  SumOfDist.feet=d1.feet+d2.feet;
  SumOfDist.inch=d1.inch+d2.inch;
  if(SumOfDist.inch>12.0)
  {
    SumOfDist.inch-=12.0;
    SumOfDist.feet++;
  }
  cout<<SumOfDist.feet<<"\'-"<<SumOfDist.inch<<"\"";
}