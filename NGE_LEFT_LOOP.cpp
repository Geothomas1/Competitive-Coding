#include <bits/stdc++.h>
using namespace std;
void NGE_LOOP(int arr[], int size)
{
    int i, j;
    for (i = 0; i < size; i++)
    {
        int next = -1;
        for (j = i - 1; j >= 0; j--)
        {

            if (arr[i] < arr[j])
            {
                next = arr[j];
                break;
            }
        }
        cout << arr[i] << "---" << next << endl;
    }
}

int main()
{
    int arr[] = {2, 4, 1, 6, 7, 3, 4};
    int size = sizeof(arr) / sizeof(arr[0]);
    NGE_LOOP(arr, size);
    return 0;
}
