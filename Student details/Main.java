#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  struct student
{
  char name[20];
  char Depart[20];
  int YoS;
  float cgpa;
};
  struct student Data[100],t;
  int num,i=1,j;
  cout<<"Enter the number of students";
  cin>>num;
  j=1;
  for(i=0;i<num;i++)
  {
    cout<<"\nEnter the details of student "<<j;
  	cout<<"\nEnter name";
  	cin>>Data[i].name;
  	cout<<"\nEnter department";
  	cin>>Data[i].Depart;
  	cout<<"\nEnter year of study";
  	cin>>Data[i].YoS;
  	cout<<"\nEnter cgpa";
  	cin>>Data[i].cgpa;
    ++j;
  }
  for(i=0;i<=num;i++)
  {
    for(j=i+1;j<=num;j++)
    {
      if(strcmp(Data[i].name,Data[j].name)>0)
      {
        t=Data[i];
        Data[i]=Data[j];
        Data[j]=t;
      }
    }
  }
  cout<<"\nDetails of students";
  j=1;
  for(i=1;i<=num;i++)
  {
  	cout<<"\nStudent "<<j;
  	cout<<"\nName:"<<Data[i].name;
  	cout<<"\nDepartment:"<<Data[i].Depart;
  	cout<<"\nYear of study:"<<Data[i].YoS;
  	cout<<"\nCGPA:"<<Data[i].cgpa;
    j++;
  }
  return 0;
}