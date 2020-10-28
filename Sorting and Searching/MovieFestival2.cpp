
#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n, x, y, k, total = 0;
  vector<pair<int, int>> arr;
  cin>>n>>k;
  for (int i=0;i<n;i++)
  {
    cin>>x>>y;
    arr.push_back(make_pair(y, x));
  }
  // sorting by ending times
  sort(arr.begin(), arr.end());
  multiset<int> ms;
  ms.insert(arr[0].first);
  k--;
  total++;
  auto it=ms.begin();
  for (int i=1;i<n;i++)
  {
    auto ele=arr[i];
    it=ms.lower_bound(ele.second);    
    if(it!=ms.begin())
    //if (ele.second >= curr_end)
    {
      if((*it)!=ele.second)
        it--;
      ms.erase(it);
      ms.insert(arr[i].first);
      total++;
    }
    else if(it==ms.begin() && (*it)==ele.second)
    {
      ms.erase(it);
      ms.insert(arr[i].first);
      total++;
    }
    else if(k>0)
    {
      ms.insert(arr[i].first);
      total++;
      k--;
    }
  }
  cout << total;
  return 0;
}