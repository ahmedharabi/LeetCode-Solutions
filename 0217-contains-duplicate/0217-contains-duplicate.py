class Solution(object):
    def containsDuplicate(self, nums):
        numsS=set(nums)
        return len(nums)!=len(numsS)
        
        