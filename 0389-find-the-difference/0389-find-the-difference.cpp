class Solution {
public:
    char findTheDifference(string s, string t) {
        int total1 = 0;
        int total2 = 0;
        for(int i=0; i<s.length(); i++){
            total1 += s[i];
        }
        for(int i=0; i<t.length(); i++){
            total2 += t[i];
        }
        return (char) (total2-total1);
    }
};