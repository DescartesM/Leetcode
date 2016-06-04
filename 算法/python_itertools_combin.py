import itertools
def fourSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[List[int]]
    """
    tmp = []
    if len(nums) <= 4:
        return
    for i in itertools.combinations(nums, 4):
        if sum(i) == target:
            tmp.append(i)
    print tmp
def main():
    A=[1,2,0,0,-1,-2]
    fourSum(A,0)



    
if __name__ == '__main__':
    main()
