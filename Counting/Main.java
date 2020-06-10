#include<iostream>
using namespace std;
int main()
{
  char str[200];
  int i=0,vowels=0,cons=0,spaces=0,digits=0,symbols=0;
  cin.getline(str,200);
  while(str[i]!='\0')
  {
    if((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<'Z'))
    {
      if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='O'||str[i]=='o'||str[i]=='U'||str[i]=='u')
        vowels++;
      else
        cons++;
    }
    else if(str[i]==' ')
      spaces++;
    else if(str[i]>='0'&&str[i]<='9')
      digits++;
    else
      symbols++;
    ++i;
  }
  std::cout<<"Vowels:"<<vowels<<"\nConsonants:"<<cons<<"\nWhite Spaces:"<<spaces;
  cout<<"\nDigits:"<<digits<<"\nSymbols:"<<symbols;
}