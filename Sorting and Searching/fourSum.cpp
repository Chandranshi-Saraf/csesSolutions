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
    map<int,pair<int,int>>pairSum;
    //unordered_map<int,pair<int,int>> pairSum;
    for (int i = 0; i < n - 1; i++)
        for (int j = i + 1; j < n; j++)
            pairSum[arr[i] + arr[j]] = { i, j };

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            lli sum = arr[i] + arr[j];
            if (pairSum.find(x-sum) != pairSum.end()) {
                pair<int,int> p= pairSum[x-sum];
                if (p.first != i && p.first != j && p.second != i && p.second != j) {
                    cout << (i+1) << " " << (j+1) << " "<< (p.first +1)<< " "<< (p.second+1);
                    return 0;
                }
            }
        }
    }
    cout<<"IMPOSSIBLE";
    return 0;
}

