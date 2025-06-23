class Solution {
    static int minFind(int[] nums,int start,int len){
        Arrays.sort(nums,start,len+1);
        int target = nums[start-1];
        while(start<len){
            int mid = start+(len-start)/2;
            if(nums[mid] <= target){
                start = mid+1;
            }
            else len = mid;
        }
        return len;
    }
    public void nextPermutation(int[] nums) {
        int len = nums.length-1;
        boolean swap = false;
        for(int i=len;i>=1;i--){
            if(nums[i]>nums[i-1]){
                int point = i;
                int temp = minFind(nums,point,len);
                int temNum = nums[temp];
                nums[temp] = nums[i-1];
                nums[i-1] = temNum;
                swap = true;
                break;
            }
        }
        if(!swap){
            for(int i=0,j=len;i<(len+1)/2;i++,j--){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]= temp;
            }
        }
    }
}