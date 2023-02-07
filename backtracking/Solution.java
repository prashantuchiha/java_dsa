import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static void CombSum(ArrayList<Integer> A, int B, ArrayList<ArrayList<Integer>> a, int index, int sum,
            ArrayList<Integer> b) {
        if (sum <= B && index < A.size()) {
            if (sum == B) {
                a.add(new ArrayList<>(b));
                return;
            }
            b.add(A.get(index));
            CombSum(A, B, a, index, sum + A.get(index), b);
            b.remove(b.size() - 1);
            if (index < A.size() - 1) {
                for (int i = index+1; i < A.size(); i++) {
                    b.add(A.get(i));
                    CombSum(A, B, a, i, sum + A.get(i), b);
                    b.remove(b.size() - 1);
                }

            }
        }
    }

    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)==A.get(i+1)){
                A.remove(i+1);
                i--;
            }
            
        }
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        CombSum(A, B, a, 0, 0, b);
        return a;
    }
}