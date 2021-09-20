package study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine1 = bufferedReader.readLine();
        String readLine2 = bufferedReader.readLine();

        System.out.println(readLine1);
        System.out.println(readLine2);
    }
}
