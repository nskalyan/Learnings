class Solution:
    def lengthOfLongestSubstring(
        self, s: str, currmaxstring: str = "",
        maxstring: str = "", index: int = 0
    ) -> int:

        if len(s) <= 1:
            return len(s)

        if index >= len(s):
            return len(maxstring)

        for i in range(index, len(s)):

            if s[i] in currmaxstring:

                if len(currmaxstring) > len(maxstring):
                    maxstring = currmaxstring

                index += 1
                currmaxstring = ""

                return self.lengthOfLongestSubstring(
                    s, currmaxstring, maxstring, index
                )

            else:
                currmaxstring += s[i]

        return max(len(currmaxstring), len(maxstring))
