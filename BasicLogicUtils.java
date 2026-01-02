public class BasicLogicUtils {

    // 1. Check if a number is Positive, Negative, or Zero
    public static String checkSign(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // 2. Linear Search: Check if an array contains a specific number
    public static boolean contains(int[] numbers, int target) {
        for (int n : numbers) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }

    // 3. Find the smallest number in an array
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // 4. Count how many times a character appears in a string
    public static int countOccurrences(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    // 5. Swap two elements in an array using a temporary variable
    public static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
    public static void main(String[] args) {
    int[] myNumbers = {10, 5, 8, 20};

    System.out.println(checkSign(-5));              // Output:Negative
    System.out.println(contains(myNumbers, 8));     // Output: true
    System.out.println(findMin(myNumbers));         // Output: 5
    System.out.println(countOccurrences("apple", 'p')); // Output: 2
    
    swap(myNumbers, 0, 3);                          // Swaps 10 and 20
    System.out.println(myNumbers[0]);               // Output: 20
}
} 