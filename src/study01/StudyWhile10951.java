package study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StudyWhile10951 {
    public static void main(String[] args) throws IOException {
        /**
         * StringTokenizer
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        String str;

        while ((str = br.readLine()) != null){
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append('\n');
        }
        System.out.println(sb);


        /**
         * Scanner
         */
//        Scanner sc = new Scanner(System.in);
//
//        while (sc.hasNextInt()){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a + b);
//        }
    }
}
