package stringPrograms;

import java.util.ArrayList;
import java.util.List;

/**
 * Input:  digits[] = "121"
 * Output: 3
 * // The possible decodings are "ABA", "AU", "LA"
 *
 * Input: digits[] = "1234"
 * Output: 3
 * // The possible decodings are "ABCD", "LCD", "AWD"
 */
public class DecodingAlphabet {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        char [] digits = {'1','2','1'};
        int n=digits.length;
        String res="";
        char ch='a';
        //traverse single digit
        for(int i=0;i<digits.length;i++){

            // for simple ones
            if((int)digits[i]<1) {
                int x = (int) digits[i];
                ch = (char)(x + '0');
                res=res+ch;
            }

        }

        System.out.println(res);
        //traverse double digit
    }
}
