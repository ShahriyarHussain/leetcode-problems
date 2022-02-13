package medium;

public class Problem_189 {

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    public static void rotate(int[] nums, int k) {
        System.out.println("1 2 3 4 5 6 7");
        for (int i = k; i < nums.length; i++) {
            int temp = nums[(i + k) % nums.length];
            nums[(i + k) % nums.length] = nums[i];
            nums[i] = temp;
        }
        for (int i : nums) {
            System.out.printf("%d ", i);
        }
    }
}
