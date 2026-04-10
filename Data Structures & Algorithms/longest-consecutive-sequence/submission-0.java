class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        int longest=0;
        for(int n:nums){
            if(!s.contains(n-1)){
                int len=0;
                while(s.contains(n+len)){
                    len+=1;
                }
                longest=Math.max(len,longest);
            }
        }
        return longest;
    }
}
