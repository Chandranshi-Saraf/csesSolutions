#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,x;
    cin>>n>>x;
    vector<pair<int,int>> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i].first;
        arr[i].second=i+1;
    }
    sort(arr.begin(),arr.end());
    int i=0;
    int j=n-1;
    while(i<j)
    {
        if(arr[i].first+arr[j].first == x)
        {
            cout<<arr[i].second<<" "<<arr[j].second;
            return 0;
        }
        if(arr[i].first+arr[j].first >x)
            j--;
        else
            i++;
    }
    cout<<"IMPOSSIBLE";
    return 0;
}