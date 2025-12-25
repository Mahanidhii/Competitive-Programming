class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        INT_MIN, INT_MAX = -2**31, 2**31 - 1

        # Step 1: Trim leading whitespace
        s = s.lstrip()
        if not s:
            return 0

        # Step 2: Determine sign
        sign = 1
        if s[0] in ('-', '+'):
            sign = -1 if s[0] == '-' else 1
            s = s[1:]

        # Step 3: Read digits
        result = 0
        for char in s:
            if not char.isdigit():
                break
            result = result * 10 + int(char)

        # Step 4: Handle overflow
        if result > INT_MAX:
            return INT_MIN if sign == -1 else INT_MAX

        return sign * result
        