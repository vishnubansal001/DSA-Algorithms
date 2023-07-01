void heapify(int arr[],int N,int i){
    int lar = i;
    int l = 2*i+1;
    int r = 2*i+2;
    if(r<N && arr[r] > arr[lar]){
        lar = r;
    }
    if(lar != i){
        swap(arr[i],arr[lar]);
        heapify(arr,N,lar);
    }
}

void heap(int arr[],int N){
    for(int i=N/2-1;i>=0;i--){
        heapify(arr,N,i);
    }
    for(int i=N-1;i>0;i--){
        swap(arr[0],arr[i]);
        heapify(arr,i,0);
    }
}