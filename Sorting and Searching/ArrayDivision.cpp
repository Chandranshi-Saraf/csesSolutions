#include <bits/stdc++.h>
#define lli long long int
using namespace std;

bool feasible(lli sum, int k, vector<int>arr, int n)
{
    int count=1;
    lli total=0;
    for (int i=0;i<n;i++)
    {
        total+=arr[i];
        if(total>sum)
        {
            total=arr[i];
            count++;
            if(count>k)
                return false;
        }
    }
    return true;

}

int main()
{
    int n;
    lli x;
    cin>>n>>x;
    int max=0;
    lli sum=0;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
        max=std::max(max,arr[i]);
        sum+=arr[i];
    }    
    //sort(arr.begin(),arr.end());
    lli left=max;
    lli right=sum;
    if(x==1)
    {
        cout<<sum;
        return 0;
    }
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
