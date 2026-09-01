class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if (nums.length == 0)
            return 0;
        for (int i : nums){
            set.add(i);
        }
        int ans = Integer.MIN_VALUE;
        int cnt = 1;
        int prev = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int i : list){
            if (i - 1 == prev){
                cnt ++;
            }
            else{
                if (ans < cnt){
                    ans = cnt;
                }
                cnt = 1;
            }
            prev = i;
        }
        if (ans < cnt)
            ans = cnt;
        return ans;
    }
}
