#include <bits/stdc++.h>
using namespace std;
void STOCK_SPAN(int arr[], int size)
{
    stack<int> s;
    vector<int> v;
    for (int i = 0; i < size - 1; i++)
    {
        int count = 0;
        if (s.size() == 0)
        {
            v.push_back(-1);
        }
        else if (s.size() > 0 && s.top() > arr[i])
        {
            v.push_back(i);
        }
        else if (s.size() > 0 && s.top() <= arr[i])
        {
            while (s.top() > 0 && s.top() <= arr[i])
            {
                s.pop();
            }
            if (s.size() == 0)
            {
                v.push_back(-1);
            }
            else
            {
                v.push_back(i);
            }
        }
        s.push(arr[i]);
    }
    for (int j = 0; j < v.size(); j++)
    {
        cout << v[j] << endl;
    }
}

int main()
{
    int arr[] = {100, 80, 60, 70, 60, 75, 85};
    int size = sizeof(arr) / sizeof(arr[0]);
    STOCK_SPAN(arr, size);
    return 0;
}