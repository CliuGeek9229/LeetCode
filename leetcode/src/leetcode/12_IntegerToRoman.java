package leetcode;

/**
 *
 * @ClassName IntegerToRoman.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2018年3月7日上午11:36:46
 * @Description Given an integer, convert it to a roman numeral.
 * 
 *              Input is guaranteed to be within the range from 1 to 3999.
 */

public class IntegerToRoman {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(intToRoman(99));
    }

    public static String intToRoman(int num) {
        String result = "";
        String keys[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for(int i = 0;num!=0;i++){
            while(num>=values[i]){
                num-=values[i];
                result+=keys[i];
            }
        }
        return result;
    }
}
