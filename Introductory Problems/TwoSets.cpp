#include <iostream>
using namespace std;

int main()
{
	int ip;
	cin >> ip;
	if(ip==1)
		cout << "NO";
	else
	{
	int size1=(int)(ip/2);
    int size2=(int)(ip-size1);
    long sum1=0;
    long sum2=0;
    long arr1[size1];
    long arr2[size2];
    int n=1;
    while(ip>0)
    {
        arr1[n-1]=ip;
        sum1=sum1+ip--;
        if(ip<=0)
            break;
        arr2[n-1]=ip;
        sum2=sum2+ip--;
        if(ip<=0)
            break;
        n++;
        arr2[n-1]=ip;
        sum2=sum2+ip--;
        if(ip<=0)
            break;
        arr1[n-1]=ip;
        sum1=sum1+ip--;

        n++;
        if(n>size1)
            break;

    }
    if(sum1==sum2 && ip==0)
    {
        cout << "YES \n";
        cout << size1 <<"\n" ;
        for(int i=0; i<size1; i++)
            cout << arr1[i] << " ";

        cout  << "\n" << size2 << "\n";
        for(int i=0; i<size2; i++)
            cout << arr2[i] << " ";

    }
    else
        cout << "NO";
	}
	return 0;
}