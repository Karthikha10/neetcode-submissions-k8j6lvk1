class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] max=new int[(nums.length-k)+1];
        for(int i=0;i<=nums.length-k;i++){
            int m=nums[i];
            for(int j=i;j<i+k;j++){
                m=Math.max(m,nums[j]);
            }
            max[i]=m;
        }
        return max;
    }
}
