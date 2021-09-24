package study01;

import java.util.Arrays;

/**
 * s = ["h","e","l","l","o"]
 * ["o","l","l","e","h"]
 */
public class ReverseString {
    public void reverseString(char[] s) {
        char[] tempArr = new char[s.length];
        int tempInt = s.length - 1;
        for (int i = 0; i < s.length; i++) {
            tempArr[tempInt] = s[i];
//            System.out.println(tempInt);
            tempInt--;
        }
        s = tempArr;
        System.out.println(Arrays.toString(s));
//        }

    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        System.out.println(Arrays.toString(s));
        rs.reverseString(s);
    }
}
