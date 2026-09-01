class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for(int i = 0; i < prices.length; i++){
            
            if (prices[i] < min){
                min = prices[i];
                max = Integer.MIN_VALUE;
            }
            if (prices[i] > max){
                max = prices[i];
            }
            if (max - min > answer)
                answer = max - min;
        }

        return answer;
    }
}
