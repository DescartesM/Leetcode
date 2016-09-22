class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        if len(digits) == 0:
            return None
        carry = 1
        for i in range(len(digits)-1,-1,-1):
            tmp = digits[i]
            digits[i] = (digits[i] + carry) % 10
            carry = (tmp + carry) / 10
        if carry:
            digits.insert(0,1)
        return digits