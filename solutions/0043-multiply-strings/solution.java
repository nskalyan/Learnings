import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n= new BigInteger(num1);   
        BigInteger n1= new BigInteger(num2);   
        String s=n1.multiply(n)+"";
        return s;
}
}
