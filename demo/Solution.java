class Solution {
    public int solution(int[] A) {
        int n = A.length;
        boolean[] occurence = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) {
                occurence[A[i]] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!occurence[i]) {
                return i;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        // int[] A = new int[] { 1, 3, 5, 4, 1, 2 };
        int[] A = new int[] { 1, 2, 3 };
        Solution solution = new Solution();
        int result = solution.solution(A);
        System.out.println("Result: " + result);
    }
}