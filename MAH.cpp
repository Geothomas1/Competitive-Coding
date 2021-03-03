#include <bits/stdc++.h>
using namespace std;
void MAH(int arr[], int size)
{
    stack<pair<int, int>> s1;
    stack<pair<int, int>> s2;
    vector<int> v1;
    vector<int> v2;
    vector<int> width;
    int temp[size];
    int k = 0;
    //NSR

    for (int i = size - 1; i >= 0; i--)
    {
        if (s1.size() == 0)
        {
            v1.push_back(size);
        }
        else if (s1.size() > 0 && s1.top().first < arr[i])
        {
            v1.push_back(s1.top().second);
        }
        else if (s1.size() > 0 && s1.top().first >= arr[i])
        {
            while (s1.size() > 0 && s1.top().first >= arr[i])
            {
                s1.pop();
            }
            if (s1.size() == 0)
            {
                v1.push_back(size);
            }
            else
            {
                v1.push_back(s1.top().second);
            }
        }
        s1.push({arr[i], i});
    }

    for (int j = size - 1; j >= 0; j--)
    {
        //cout << v1[j] << endl;
        temp[k] = v1[j];
        //cout<<temp[k]<<endl;;
        k = k + 1;
    }

    //NSL

    for (int i = 0; i < size; i++)
    {
        if (s2.size() == 0)
        {
            v2.push_back(-1);
        }
        else if (s2.size() > 0 && s2.top().first < arr[i])
        {
            v2.push_back(s2.top().second);
        }
        else if (s2.size() > 0 && s2.top().first >= arr[i])
        {
            while (s2.size() > 0 && s2.top().first >= arr[i])
            {
                s2.pop();
            }
            if (s2.size() == 0)
            {
                v2.push_back(-1);
            }
            else
            {
                v2.push_back(s2.top().second);
            }
        }
        s2.push({arr[i], i});
    }

    // for(int m=0;m<v2.size();m++)
    // {
    //     cout<<v2[m]<<endl;

    // }
    for (int i = 0; i <size ; i++)
    {
        width[i] = (temp[i] - v2[i]) - 1;
        cout << arr[i] * width[i] << endl;
    }
}

int main()
{
    int arr[] = {6, 2, 5, 4, 5, 1, 6};
    int size = sizeof(arr) / sizeof(arr[0]);
    MAH(arr, size);
    return 0;
}