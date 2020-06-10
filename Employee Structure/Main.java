#include<iostream>
using namespace std;
struct employee
  {
    char name[50];
    int id;
    int age;
    char design[50];
    long sal;
  };
int main()
{
  employee E;
  cout<<"Enter name:";
  cin.getline(E.name,50);
  cout<<"\nEnter ID:";
  cin>>E.id;
  cout<<"\nEnter age:";
  cin>>E.age;
  cout<<"\nEnter designation:";
  cin>>E.design;
  cout<<"\nEnter Salary:";
  cin>>E.sal;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<E.name;
  cout<<"\nID of the Employee : "<<E.id;
  cout<<"\nAge of the Employee : "<<E.age;
  cout<<"\nDesignation of the Employee : "<<E.design;
  cout<<"\nSalary of the Employee : "<<E.sal;
}