#include<bits/stdc++.h>
using namespace std;
int main()
{
    char str1[10];
    char str2[10];
    cin>>str1;
    for(int i=strlen(str1);i>0;i--)
    {
        str2[i]=str1[i];

    }
    if(strcmp(str1,str2))
    {
        cout<<"Yes";
    }else{
        cout<<"No";
    }


    return 0;
}