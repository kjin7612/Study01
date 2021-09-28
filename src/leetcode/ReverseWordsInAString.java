package leetcode;

/**
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String rtn = "";
        String[] rtnStr = s.split(" "); // 받은 문자열을 빈칸을 기준으로 배열로 만들어 줌
        for (int i = 0; i < rtnStr.length; i++) {   // 배열을 원소로 만듦
            char[] cArr = new char[rtnStr[i].length()];

            for (int j = 0, k = cArr.length - 1; j < cArr.length; j++) {
                System.out.println("j: " + j + ", K: " + k);
                cArr[j] = rtnStr[i].charAt(k);
                k--;
            }
            String blk = " ";
//            if(i == rtnStr.length - 1){
//                blk = "";
//            }
            String tmpStr = String.valueOf(cArr) + blk;
            rtn += tmpStr;
            System.out.println(rtn);
        }


        return rtn.trim();
    }

    public static void main(String[] args) {
        ReverseWordsInAString swa = new ReverseWordsInAString();
        String s = "Let's take LeetCode contest";
        swa.reverseWords(s);
    }
}
