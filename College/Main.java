#include<iostream>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int EstYear;
  float PassPer;
};
int main()
{
  int n,i,j;
  cout<<"Enter the number of colleges";
  cin>>n;
  struct college C[n];
  j=1;
  for(i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<j;
    cout<<"\nEnter name";
    cin>>C[i].name;
    cout<<"\nEnter city";
    cin>>C[i].city;
    cout<<"\nEnter year of establishment";
    cin>>C[i].EstYear;
    cout<<"\nEnter pass percentage";
    cin>>C[i].PassPer;
    j++;
  }
  j=1;
  cout<<"\nDetails of colleges";
  for(i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<j;
    cout<<"\nName:"<<C[i].name;
    cout<<"\nCity:"<<C[i].city;
    cout<<"\nYear of establishment:"<<C[i].EstYear;
    cout<<"\nPass percentage:"<<C[i].PassPer;
    j++;
  }
  return 0;
}