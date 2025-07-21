class Solution(object):
    def makeFancyString(self, s):
        freq=0
        res=""
        res+=s[0]
        for i in range(1,len(s)):
            if(s[i]==s[i-1]):
                freq+=1
            else:
                freq=0
            if(freq==2):
                freq-=1
            else:
                res+=s[i]
        return res
        
