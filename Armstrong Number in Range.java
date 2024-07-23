public class ArmstrongInRange {
    public static void main(String[] args) {
        int start = 1, end = 500;

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num, result = 0, n = 0;

        while (original != 0) {
            original /= 10;
            n++;
        }

        original = num;
        while (original != 0) {
            int remainder = original % 10;
            result += Math.pow(remainder, n);
            original /= 10;
        }

        return result == num;
    }
}
