class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int last = 0;
        int nums = x;
        if (x < 0)
            return false;
        while (x != 0){
            last = x % 10;
            reversed = reversed * 10 + last;
            x = x / 10;
        }
        if (nums == reversed){
            return true;
        }
        else{
            return false;
        }
    }
}
