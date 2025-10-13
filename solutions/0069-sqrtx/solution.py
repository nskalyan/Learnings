class Solution:
    def mySqrt(self, x: int) -> int:
        if x==0 or x==1 :
            return x

        i=1
        while i <= x :
            if i*i==x :
                return i

            elif i*i > x:
                return i-1
            i+=1

        
