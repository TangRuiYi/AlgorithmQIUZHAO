package practice;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        String s1 = "";
        String t1 = "";
        for (int i = 0; i < s.length(); i++) {
            arr1[(s.charAt(i) - 'a')]++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr2[(t.charAt(i) - 'a')]++;
        }
        for (int i = 0; i < arr1.length; i++) {
            s1 += arr1[i] + "#";
        }
        for (int i = 0; i < arr2.length; i++) {
            t1 += arr2[i] + "#";
        }
        return s1.equals(t1) ? true : false;
    }

    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
}
