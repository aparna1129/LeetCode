class Solution {
    public void rotate(int[] nums, int k) {
        if(k >= nums.length) k = k%nums.length;
        // int[] temp = new int[k];
        // for(int i = n-k; i < n; i++){
        //     temp[i-(n-k)] = nums[i];
        // }
        // for(int i = k; i < n; i++){
        //     nums[i] = nums[i-(k-i)];
        // }
        // for(int i = 0; i < k; i++){
        //     nums[i] = temp[i];
        // }

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);

    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

