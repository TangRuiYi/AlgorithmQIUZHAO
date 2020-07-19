package practice;

import java.math.BigInteger;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str += digits[i];
        }
        BigInteger num = new BigInteger(str);
        BigInteger one = new BigInteger("1");
        num = num.add(one);
        char[] chars = num.toString().toCharArray();
        int[] res = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            res[i] = Integer.parseInt(chars[i] + "");
        }
        return res;
    }

    public static int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println(plusOne1(digits));
    }
}
