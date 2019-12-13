import java.util.Arrays;

public class LC0001 {
    public static void main(String[] args) {
        LC0001 solution = new LC0001();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        int a;
        for (int i = 0; i < nums.length; i++) {
            a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (a + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}