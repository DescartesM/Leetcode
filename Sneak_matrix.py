# Tecent tech first test
# sneak matrix
# 123
# 456
# 789
def func(nums):
    myList = [([0] * nums) for i in range(nums)]
    count = 1
    round_times = nums / 2 # round times
    if nums == 1:
        myList[0][0] = count
        return myList
    else:
        for my_round in range(round_times):
            i = my_round
            for j in range(my_round, nums - my_round):
                myList[i][j] = count
                count = count + 1
            # output 123
            #        000
            #        000
            j = nums - my_round - 1 
            for i in range(my_round + 1, nums - my_round -1):
                myList[i][j] = count
                count = count + 1
            # output 123
            #        004
            #        000
            i = nums - my_round -1 
            for j in range(nums - my_round - 1, my_round, -1):
                myList[i][j] = count
                count = count + 1
            # output 123
            #        004
            #        065
            j = my_round
            for i in range(nums - my_round -1, my_round, -1):
                myList[i][j] = count
                count = count + 1
            # output 123
            #        804
            #        765 
        # if odd 
        if nums % 2 != 0:
            myList[nums/2][nums/2] = count;
        return myList



def main():
    nums = input("nums:")
    print func(nums)
if __name__ == '__main__':
    main() 