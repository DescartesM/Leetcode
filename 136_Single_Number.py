class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        for i in xrange(len(nums)):
            res ^= nums[i]
        return res