class Solution {
//     public String multiply(String num1, String num2) {
//         // int n1 = Integer.parseInt(num1);
//         // int n2 = Integer.parseInt(num2);
//         // int res = n1*n2;
//         // return Integer.toString(res);
        
//     }
        public String multiply(String num1, String num2) {
        // Edge case for multiplication with zero
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        int len1 = num1.length();
        int len2 = num2.length();
        
        // Initialize the result array with zeros
        int[] result = new int[len1 + len2];
        
        // Convert strings to character arrays for easier manipulation
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        
        // Perform the multiplication digit by digit
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (arr1[i] - '0') * (arr2[j] - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                
                // Add multiplication result to the corresponding position in result array
                int sum = mul + result[p2];
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        
        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }
        
        return sb.toString();
    }
}