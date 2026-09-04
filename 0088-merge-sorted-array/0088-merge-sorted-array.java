class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare both arrays
        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        // Remaining elements of nums1
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        // Remaining elements of nums2
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        // Copy result back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = arr[x];
        }
    }
}
