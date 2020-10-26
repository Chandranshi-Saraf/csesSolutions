#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main()
{
    int n;
    lli x;
    cin>>n>>x;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }    
    int start=0;
    int end=0;
    int count=0;
    lli sum=0;
    while(end<n && start<=end)
    {
        if(sum==x)
        {
            count++;
            sum=sum+arr[end++]-arr[start++];
        }
        else if(sum>x)
        {
            sum=sum-arr[start++];
        }
        else
        {
            sum=sum+arr[end++];
        }      
    }
    if(sum==x)
        count++;
    while(sum>x && start<n)
    {
        sum-=arr[start++];
        if(sum==x)
            count++;
    }

    cout<<count;
    return 0;
}