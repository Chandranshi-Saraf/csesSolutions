#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main()
{
    lli n,m,i,x;
    cin >> n >> m;
    multiset<lli, greater<int>> arr;

    while(n--)
    {
        cin>>x;
        arr.insert(x);
    }

    while(m--)
    {
        cin>>i;
        auto it=arr.lower_bound(i);
        if (it==arr.end())
        {
            cout<<-1<<endl;
        }
        else
        {
            cout<<*it<<endl;
            arr.erase(it);
        }
    }
    return 0;
}