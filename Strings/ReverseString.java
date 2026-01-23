public class ReverseString {

    // Problem: Reverse a String
    // Reverse the given string.
    //
    // Approach: Two Pointer
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
}
