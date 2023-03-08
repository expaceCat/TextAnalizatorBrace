import java.io.*;

public class TextAnalizator {


    public void checkBrace(String str) {
        int openBrace = 0;
        int closeBrace = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[' ) {
                openBrace++;
            }
            if(str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
                closeBrace++;
            }
        }
        if (openBrace == closeBrace) {
            System.out.println("Корректно.");
        } else {
            System.out.println("Некорректно.");
        }
    }
}
