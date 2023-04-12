#include <bits/stdc++.h>

using namespace std;

long long maxSum(int arr[],int n){
    long long curr = 0;
    long long maxi = arr[0];
    for(int i=0;i<n;i++){
        curr += arr[i];
        if(curr>maxi) maxi = curr;
        if(curr<0) curr=0;
    }
    return maxi;
}