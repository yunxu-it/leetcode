public class LCP1 {

    static class Solution {
        public int game(int[] guess, int[] answer) {
            int num = 0;
            for (int i = 0; i < 3; i++) {
                if (guess[i] == answer[i]) {
                    num++;
                }
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] guess = new int[]{1, 2, 3};
        int[] answer = new int[]{1, 2, 3};
        System.out.println(solution.game(guess, answer));
    }
}
