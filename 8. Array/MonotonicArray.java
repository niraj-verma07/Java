public class MonotonicArray {

    public static boolean isIncreasing(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMonotonic(int nums[]) {
        boolean isInc = isIncreasing(nums);
        boolean isDec = isDecreasing(nums);

        return isInc || isDec;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3 };
        System.out.println(isMonotonic(nums));
    }
}
