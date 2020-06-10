#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum;
	//Type your code here
  std::string substr(".");
	std::cin>>fnum;
  size_t pos;
  if(fnum.find(substr)!=std::string::npos)
  {  size_t pos=fnum.find(".");
  	fnum=fnum.substr(pos+1);
  	std::cout<<"Floating part is : "<<fnum;
  }
  else
    std::cout<<"Floating part is : ";
}