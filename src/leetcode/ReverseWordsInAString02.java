package leetcode;

/**
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsInAString02 {
    public String reverseWords(String s) {
       String[] words = s.split(" ");
       String ans = "";
        for (String word : words) {
//            System.out.println(word);
            for (int i = word.length() - 1; i >= 0; i--) {
//                System.out.println(i);
                ans += word.charAt(i);
            }
            ans += " ";
        }


        return ans.trim();
    }

    public static void main(String[] args) {
        ReverseWordsInAString02 swa = new ReverseWordsInAString02();
        String s = "Let's take LeetCode contest";
//        swa.reverseWords(s);
        System.out.println(swa.reverseWords(s));
    }

}
