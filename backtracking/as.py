import sys
class Solution(object) :
 
    def answer(self, a,  list,  A,  b,  sum,  i,k) :
        list.append(A[i])
        sum += A[i]
        if (sum == b) :
            list1 =  []
            for i in list: 
                list1.append(i)
            a.append(list1)
           # i += 1
            return
        if (sum > b) :
            return
        j = i
        while (j < len(A)) :
            self.answer(a, list, A, b, sum, j,k)
            del list[len(list) - 1]
            j += 1

        if(len(list)==1 and list[0]==A[k] and k!=len(A)-1):
            k+=1
            list=[]
            sum=0
            self.answer(a,list,A,b,sum,k,k)
            
           
        return
  

    @staticmethod
    def  combinationSum( A,  B) :
        hashSet =  set()
        hashSet=A
        a=[]
        A=hashSet
        A.sort()
        obj = Solution()
        list =  []
        obj.answer(a, list, A, B, 0, 0,0)
        return a
    @staticmethod
    def main( args) :
        a =  []
        a.append(8)
        a.append(1)
        a.append(6)
        a.append(8)
        # a.append(8)
        # a.append(2)
        # a.append(9)
        A = Solution.combinationSum(a, 12)
        print(A)
    

if __name__=="__main__":
    Solution.main(sys.argv)











    



#    def answer(self, a,  list,  A,  b,  sum,  i) :
#         if (sum == b) :
#             a.append(list)
#             list.clear()
#             return
#         if (sum > b) :
#             list.clear()
#             return
#         list.append(A[i])
#         sum += A[i]
#         j = i
#         while (j < len(A)) :
#             list1 =  []
#             self.answer(a, list1, A, b, sum, j)
#             j += 1
#         return