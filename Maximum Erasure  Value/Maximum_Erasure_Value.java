class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       Set<Integer> map = new HashSet<>();
       int l = 0;
       int c = 0;
       int sum = 0;

       for(int r = 0;r<nums.length;r++){
        while(map.contains(nums[r])){
            c -= nums[l];
            map.remove(nums[l]);
            l++;
        }
        map.add(nums[r]);
        c+=nums[r];
        sum = Math.max(sum,c);

       }
       return sum;
    }

}