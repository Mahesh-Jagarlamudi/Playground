#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
    float X1,Y1,X2,Y2,X3,Y3;
    cin>>X1>>Y1>>X2>>Y2>>X3>>Y3;
    float CX1 = (X1+X2+X3)/3;
    float CY1 = (Y1+Y2+Y3)/3;
    cout<<CX1<<"\n"<<CY1;
    return(0);
}