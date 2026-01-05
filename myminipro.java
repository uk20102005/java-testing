import java.util.Arrays;

public class myminipro {
    

class MathUtils {

    static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    static long factorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

class StringUtils {

    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(reverse(s));
    }

    static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
        }
        return count;
    }

    static String removeDuplicates(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (result.indexOf(s.charAt(i)) == -1)
                result += s.charAt(i);
        }
        return result;
    }
}

class ArrayUtils {

    static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            if (x > max) max = x;
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr)
            if (x < min) min = x;
        return min;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
}

public class UtilityLibrary {

    public static void main(String[] args) {

        // ----- Math Utilities -----
        System.out.println("Power(2,5): " + MathUtils.power(2,5));
        System.out.println("Factorial(5): " + MathUtils.factorial(5));
        System.out.println("IsPrime(17): " + MathUtils.isPrime(17));
        System.out.println("GCD(24,36): " + MathUtils.gcd(24,36));

        // ----- String Utilities -----
        String str = "programming";
        System.out.println("\nReverse: " + StringUtils.reverse(str));
        System.out.println("Palindrome(madam): " + StringUtils.isPalindrome("madam"));
        System.out.println("Vowels count: " + StringUtils.countVowels(str));
        System.out.println("Remove duplicates: " + StringUtils.removeDuplicates(str));

        // ----- Array Utilities -----
        int[] arr = {5, 2, 9, 1, 7};

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        ArrayUtils.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Search 9 index: " + ArrayUtils.search(arr, 9));
        System.out.println("Max: " + ArrayUtils.findMax(arr));
        System.out.println("Min: " + ArrayUtils.findMin(arr));

        ArrayUtils.reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

}