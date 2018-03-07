package leetcode;

/**
 *
 * @ClassName RomantoInteger.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2018年3月6日下午4:51:39
 * @Description Given a roman numeral, convert it to an integer.
 * 
 *              Input is guaranteed to be within the range from 1 to 3999.
 */

public class RomantoInteger {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(romanToInteger("IV"));
    }
    public static int romanToInteger(String s){
        int i, total, pre, cur;  
        
        total = charToInt(s.charAt(0));  
  
        for (i = 1; i < s.length(); i++) {  
            pre = charToInt(s.charAt(i - 1));  
            cur = charToInt(s.charAt(i));
            System.out.println(pre);
            System.out.println(cur);
  
            if (cur <= pre) {  
                total += cur;  
            } else {  
                total = total - pre * 2 + cur;
                System.out.println(total);
            }  
        } 
        return total;  
    }
    public static int charToInt(char c) {  
        int currentResult = 0;  
        switch (c) {  
            case 'I':  
                currentResult = 1;  
                break;  
            case 'V':  
                currentResult = 5;  
                break;  
            case 'X':  
                currentResult = 10;  
                break;  
            case 'L':  
                currentResult = 50;  
                break;  
            case 'C':  
                currentResult = 100;  
                break;  
            case 'D':  
                currentResult = 500;  
                break;  
            case 'M':  
                currentResult = 1000;  
                break;
        }
        return currentResult;  
    }  

}
