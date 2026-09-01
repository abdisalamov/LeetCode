class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        int pos = words.length - 1;
        return words[pos].length();
    }
}
