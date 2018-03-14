package leetcode;

/**
 *
 * @ClassName ReverseInteger.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2018年3月14日下午5:20:27
 * @Description Given a 32-bit signed integer, reverse digits of an integer.
 * 
 *              Example 1:
 * 
 *              Input: 123 Output: 321
 * 
 *              Example 2:
 * 
 *              Input: -123 Output: -321
 * 
 *              Example 3:
 * 
 *              Input: 120 Output: 21
 * 
 *              Note: Assume we are dealing with an environment which could only
 *              hold integers within the 32-bit signed integer range. For the
 *              purpose of this problem, assume that your function returns 0
 *              when the reversed integer overflows.
 * 
 *              如下我给出的测试例，末尾是0，题目的最终的judge将其逆序成-987654321，不考虑这个0.
 *              所以其实是题目并没限制我们的输入末尾为0的数。如果考虑的话，很简单，直接将注释掉的两行恢复即可。
 */

public class ReverseInteger {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(reverse(-1234567890));
    }

    public static int reverse(int x) {
        int result = 0;
//        if(x%10 == 0)
//            return 0;
        while(x!=0){
            int tmp = x%10;
            int newResult =result*10+tmp;
            if((newResult-tmp)/10!=result)
                return 0;
            result = newResult;
            x/=10;
        }
        return result;
    }

}
