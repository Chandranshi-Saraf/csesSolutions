#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main()
{
    int n,x,y;
    cin>>n>>x;
    vector<pair<int,int>> arr;
    for(int i=0;i<n;i++){
        cin>>y;
        arr.push_back(make_pair(y,i+1));
    }
    sort(arr.begin(),arr.end());
    lli sum=0;
    for(int i=0;i<n-2;i++)
    {
        sum=x-arr[i].first;
        int l=i+1;
        int r=n-1;
        while(l<r){
        if(arr[l].first+arr[r].first==sum){
            cout<<arr[i].second<<" "<<arr[l].second<<" "<<arr[r].second;
            return 0;
        }
        else if(arr[l].first+arr[r].first>sum)
            r--;
        else
            l++;
    }
    }
    cout<<"IMPOSSIBLE";
    return 0;
}