class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        return str(x)==str(x)[::-1] #Converting number to string
        if isPalindrome(x):
            return True
        else:
            return False
        