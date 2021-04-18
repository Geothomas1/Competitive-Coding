#include<bits/stdc++.h>
using namespace std;
int main()
{
int N;
cin>>N;
int res=0,s=1;
if(N<0)
{
    cout<<"ERROR";
}else if(N==0)
{
    cout<<0;
}
for(int i=1;i<=N;i++)
{
    res=res+s;
    s=s+2;
}
if(res!=0 && res!=-1)
{
cout<<res;
}
return 0;
}