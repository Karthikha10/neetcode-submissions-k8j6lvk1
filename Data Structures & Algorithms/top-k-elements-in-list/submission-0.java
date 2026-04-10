class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> c=new HashMap<>();
        for(int n:nums){
            c.put(n, c.getOrDefault(n,0)+1);
        }
        List<Integer>[] freq=new List[nums.length+1];
        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e:c.entrySet()){
            freq[e.getValue()].add(e.getKey());
        }
        int[] res=new int[k];
        int index=0;
        for(int i=freq.length-1;i>0 && index<k;i--){
            for(int n:freq[i]){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }
        return res;

    }
}
