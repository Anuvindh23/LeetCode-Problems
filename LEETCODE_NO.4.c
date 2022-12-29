double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){
    int Size=nums1Size+nums2Size;
    int res[Size];
    for(int index=0;index<nums1Size;index++){
        res[index]=nums1[index];
    }
    for(int index=0;index<nums2Size;index++){
        res[index+nums1Size]=nums2[index];
    }
    for(int i=0;i<Size;i++){
        for(int j=i+1;j<Size;j++){
            if(res[i]>res[j]){
                int temp=res[i];
                res[i]=res[j];
                res[j]=temp;
            }
        }
    }
    if(Size%2==0){
        return (res[(Size/2)-1]+res[(Size/2)])/2.00;
    }
    else{
        return res[Size/2];
    }
}