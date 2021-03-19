#include<bits/stdc++.h>
using namespace std;
int main()
{
    int arr[]={10,20,40,30,60};
    int n=sizeof(arr)/sizeof(arr[0]);
    int pos,temp;
    cin>>pos;
    for(int i=0;i<n;i++)
	{		
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				temp  =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}

    cout<<arr[pos-1];
    return 0;
}