public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8};
        int n = array.length + 1;
        int sumOfN = n * (n + 1) / 2;
        int sumOfArray = 0;

        for (int num : array) {
            sumOfArray += num;
        }

        int missingNumber = sumOfN - sumOfArray;
        System.out.println("Missing number is: " + missingNumber);
    }
}
