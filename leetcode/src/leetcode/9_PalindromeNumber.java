package leetcode;

/**
 *
 * @ClassName PalindromeNumber.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2018年3月3日上午9:34:54
 * @Description Determine whether an integer is a palindrome. Do this without
 *              extra space.
 * 
 *              click to show spoilers.
 * 
 *              Some hints: Could negative integers be palindromes? (ie, -1)
 * 
 *              If you are thinking of converting the integer to string, note
 *              the restriction of using extra space.
 * 
 *              You could also try reversing an integer. However, if you have
 *              solved the problem "Reverse Integer", you know that the reversed
 *              integer might overflow. How would you handle such case?
 * 
 *              There is a more generic way of solving this problem.
 */

public class PalindromeNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int A = 1221;
//        System.out.println(Integer.MAX_VALUE);
        boolean result = isPalindrome(A);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x){
        if(x<0 || (x%10 == 0 && x!=0))
            return false;
        int revert = 0;
        while(x>revert){
            revert = revert*10+x%10;
            x = x/10;
        }
        if(x == revert || x == revert/10)
            return true;
        return false;
    }

}
