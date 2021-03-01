#include <bits/stdc++.h>
using namespace std;
void NSE_RIGHT_STACK(int arr[], int size)
{
    stack<int> s;
    vector<int> v;
    for (int i = size-1; i >=0; i--)
    {
        if (s.size() == 0)
        {
            v.push_back(-1);
        }
        else if (s.size() > 0 && s.top() < arr[i])
        {
            v.push_back(s.top());
        }
        else if (s.size() > 0 && s.top() >= arr[i])
        {
            while (s.size() > 0 && s.top() >= arr[i])
            {
                s.pop();
            }
            if (s.size() == 0)
            {
                v.push_back(-1);
            }
            else
            {
                v.push_back(s.top());
            }
        }
        s.push(arr[i]);
    }

    for (auto j = v.end(); j>=v.begin(); j--)
    {
        cout << *j << endl;
    }
}
int main()
{
    int arr[] = {4,5,2,10,8};
    int size = sizeof(arr) / sizeof(arr[0]);
    NSE_RIGHT_STACK(arr, size);
    return 0;
}