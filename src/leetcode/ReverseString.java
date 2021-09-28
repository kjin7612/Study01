package leetcode;

/**
 * s = ["h","e","l","l","o"]
 * ["o","l","l","e","h"]
 */
public class ReverseString {
    public void reverseString(char[] s) {
       int n = s.length;
        for (int i = 0, j = n -1; i < j; i++) {
            char tmp = s[i];
        }

//        int n = s.length;
//        for (int i = 0, j = n -1; j > i; i++) {
//            char tmp = s[i];
//            char right = s[j];
//            s[i] = right;
//            s[j] = tmp;
//            j--;
//        }
//        System.out.println(s);
//        char[] tempArr = new char[s.length];
//        int tempInt = s.length - 1;
//        for (int i = 0; i < s.length; i++) {
//            tempArr[tempInt] = s[i];
//            tempInt--;
//        }
//        s = tempArr;
//        System.out.println(Arrays.toString(s));

    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        System.out.println(Arrays.toString(s));
        rs.reverseString(s);
    }
}
