#include <bits/stdc++.h>
using namespace std;
void RWT(int arr[], int size)
{
    int maxl[size];
    int maxr[size];
    maxl[0] = arr[0];
    maxr[size - 1] = arr[size - 1];
    int water[size];
    int sum = 0;
    for (int i = 1; i < size; i++)
    {
        maxl[i] = max(maxl[i - 1], arr[i]);
    }
    for (int i = size - 2; i >= 0; i--)
    {
        maxr[i] = max(maxr[i + 1], arr[i]);
    }
    for (int i = 0; i < size; i++)
    {
        water[i] = min(maxl[i], maxr[i]) - arr[i];
    }
    for (int i = 0; i < size; i++)
    {
        sum = sum + water[i];
    }

    cout << "Rain Trapping Amount =" << sum << endl;
}
int main()
{
    int arr[] = {3, 0, 0, 2, 0, 4};
    int size = sizeof(arr) / sizeof(arr[0]);
    RWT(arr, size);
    return 0;
}