class Solution {
    public int singleNonDuplicate(int[] arr) {
     int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return arr[left];

        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] == arr[j]) {
        //             arr[i] = -1;
        //             arr[j] = -1;
        //         }
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] != -1) {
        //         return arr[i];
        //     }
        // }
        // return -1;
    }
}