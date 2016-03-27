def missingNumber(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    n = len(nums) + 1
    if n == 1:
        return 1

    i = 0x01
    tmp = 0x00
    for i in range(1, n):
        tmp = tmp ^ i ^ nums[i-1]

    if tmp != 0:
        return tmp
    else:
        return 0
    

def main():
    a = [0,1,2]
    print missingNumber(a)

if __name__ == '__main__':
    main()
