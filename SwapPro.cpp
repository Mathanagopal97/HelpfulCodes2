#include <iostream>

using namespace std;
int arr[1000];
int arr2[1000];
void swap(int size)
{
    int start = size/2;
    int j=0;
    for(int i=start;i<size;i++)
    {
        arr2[j] = arr[i];
        j++;
    }
    for(int i=start-1;i>=0;i--)
    {
        arr2[j] = arr[i];
        j++;
    }
}
int main() {
int size;
cin>>size;
for(int i=0;i<size;i++)
{
    cin>>arr[i];
}
swap(size);
for(int i=0;i<size;i++)
{
    cout<<arr2[i]<<" ";
}
int sum=0;
for(int i=0;i+1<size;i++)
{
    int diff = arr2[i]-arr2[i+1];
    if(diff<0) diff=diff*-1;
    cout<<"diff = "<<diff<<"\n";
    sum=sum+diff;
}
int diff = arr2[0]-arr2[size-1];
if(diff<0) diff=diff*-1;
sum = sum+diff;
cout<<"diff = "<<diff<<"\n";
cout<<sum;
}
