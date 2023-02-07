class Solution :
    @staticmethod
    def  findPairSum( arr,  target) :
        # Write your code here
        a = 0
        low = 0
        b = 0
        high = len(arr) - 1
        i = 0
        while (i < len(arr) - 1) :
            if (arr[i] > arr[i + 1]) :
                a = i + 1
            i += 1
        while (low < high) :
            b = arr[low] + arr[high]
            if (b == target) :
                return True
            if (b > target & high != a) :
                high -= 1
            elif(b < target & low != a - 1) :
                low += 1
            elif(high == a - 1 & b > target) :
                low = a
                high = len(arr) - 1
            elif(low == a & b < target) :
                low = 0
                high = a - 1
        return False
    @staticmethod
    def main( args) :
        arr = [11, 15, 6, 8, 9, 10]
        obj = Solution()
        if (Solution.findPairSum(arr, 16)) :
            print("true")
        else :
            print("false")
    

if __name__=="__main__":
    Solution.main([])