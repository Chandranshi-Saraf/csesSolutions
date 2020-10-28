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
    map<lli,int>prevSum;
    lli count= 0;
    lli sum = 0;
    prevSum[0]=1;
    for (int i=0; i<n; i++) {

        sum +=arr[i];
        if(prevSum.find(sum-x) != prevSum.end())
            count+=(prevSum[sum-x]);

        prevSum[sum]++;
    }

    cout<<count;
    return 0;
}