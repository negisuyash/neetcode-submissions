class Solution {

    public void merge(int[] arr, int[] left, int[] right, int ln, int rn){
        int i =0, j=0, k=0;
        while(i < ln && j< rn){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i < ln){
            arr[k++] = left[i++];
        }
        while(j < rn){
            arr[k++] = right[j++];
        }
    }

    public void mergeSort(int[] arr, int n){
        if(n<2)     return;
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        for(int i=0;i<mid;i++){
            l[i] = arr[i];
        }
        for(int i=mid;i<n;i++){
            r[i-mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n-mid);
        merge(arr, l, r, mid, n-mid);

    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, nums.length);
        return nums;
    }
}