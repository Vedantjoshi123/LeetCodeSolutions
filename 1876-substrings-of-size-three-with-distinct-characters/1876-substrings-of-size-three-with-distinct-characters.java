class Solution {
    public int countGoodSubstrings(String s) {
        String[] strarr = new String[s.length()];
        int index = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            strarr[index++] = s.substring(i, i + 3);
        }
        int count = 0;
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i] != null) {
                int j = 0;
                if ((strarr[i].charAt(j) != strarr[i].charAt(j + 1)) &&
                        (strarr[i].charAt(j) != strarr[i].charAt(j + 2)) &&
                        (strarr[i].charAt(j + 1) != strarr[i].charAt(j + 2))) {
                    count++;
                }
            }

        }

        return count;
    }
}