#include<bits/stdc++.h>
using namespace std;
void MAH(int arr[],int size)
{
    stack <pair <int,int>> s1;
    stack <pair <int,int>> s2;
    vector <int> v1;
    vector <int> v2;
    vector <int> width;

    
    //NSR

    for(int i=size-1;i>=0;i++)
    {
        if(s1.size()==0)
        {
            v1.push_back(size+1);
        }else if(s1.size()>0 && s1.top().first<arr[i])
        {
            v1.push_back(s1.top().second);
        }else if(s1.size()>0 && s1.top().first>=arr[i])
        {
            while (s1.size()>0 && s1.top().first>=arr[i])
            {
                s1.pop();
            }
            if(s1.size()==0)
            {
                v1.push_back(size+1);
            }else
            {
                v1.push_back(s1.top().second);
            }
            
        }
        s1.push({arr[i],i});
    }

    //NSL

    for(int i=0;i<size-1;i++)
    {
        if(s2.size()==0)
        {
            v2.push_back(-1);
        }else if(s2.size()>0 && s2.top().first<arr[i])
        {
            v2.push_back(s2.top().second);
        }else if(s2.size()>0 && s2.top().first>=arr[i])
        {
            while (s2.size()>0 && s2.top().first>=arr[i])
            {
                s2.pop();
            }
            if(s2.size()==0)
            {
                v2.push_back(-1);
            }else
            {
                v2.push_back(s2.top().second);
            }
            
        }
        s1.push({arr[i],i});
    }
    for(int i=0;i<v1.size();i++)
    {
        width[i]=v1[i]-v2[i];
        cout<<arr[i]*width[i]<<endl;
    }


}

int main()
{
    int arr[]={6,2,5,4,5,6};
    int size=sizeof(arr)/sizeof(arr[0]);
    MAH(arr,size);
    return 0;
}