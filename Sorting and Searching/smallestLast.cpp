#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main()
{
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    stack<pair<int,int>> s;
    vector<int> ans;
    s.push({arr[0],1});
    ans.push_back(0);
    for(int i=1;i<n;i++)
    {
        while(!s.empty() && s.top().first>=arr[i])
            s.pop();
        if(s.empty())
        {
            s.push({arr[i],i+1});
            ans.push_back(0);
        }
        else
        {
            ans.push_back(s.top().second);
            s.push({arr[i],i+1});
            //ans[i]=s.top().second;
        }
    }
    for(int i=0;i<n;i++)
        cout<<ans[i]<<" ";


    return 0;
}