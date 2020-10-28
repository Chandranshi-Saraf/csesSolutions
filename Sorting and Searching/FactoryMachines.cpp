#include <bits/stdc++.h>
#define lli long long int
using namespace std;

bool feasible(lli sum, lli x, vector<int>arr, int n)
{

    lli total=0;
    for (int i=0;i<n;i++)
    {
        total+=(sum/arr[i]);
    }
    if(total<x)
        return false;
    return true;

}

int main()
{
    int n;
    lli x;
    cin>>n>>x;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }    
    sort(arr.begin(),arr.end());
    lli left=1;
    lli right=(arr[0]*x);
    while(left<right)
    {
        lli mid=left+(right-left)/2;
        if(feasible(mid,x,arr,n))
            right=mid;
        else
            left=mid+1;
    }

    cout<<left;
}
