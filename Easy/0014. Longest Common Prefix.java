class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i ++) {
            boolean check = false;
            for (int x = 0; x < strs.length; x ++){
                if (i >= strs[x].length() || strs[0].charAt(i) != strs[x].charAt(i)) {
                    check = true;
                    break;
                }
            }
            if (check == true)
                break;

            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
}
