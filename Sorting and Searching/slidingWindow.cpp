#include<bits/stdc++.h>
#define ll long long

using namespace std;

int main(){
	ll n,k;
	cin>>n>>k;
	vector<int> a(n);
	for (int i = 0; i < n; ++i)
	{
		cin>>a[i];
	}
	multiset<int> ms;
	for(int i=0;i<k;i++){
		ms.insert(a[i]);
	}
	int median_index = k/2-(k%2==0);

	multiset<int>::iterator it = ms.begin();
	cout<<*next(it,median_index)<<" ";
	for(int i=1;i+k-1<n;i++){
		ms.erase(ms.lower_bound(a[i-1]));
		ms.insert(a[i+k-1]);
		it = ms.begin();
		cout<<*next(it,median_index)<<" ";
	}
}