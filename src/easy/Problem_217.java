package easy;

class Problem_217 {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}