public class valid_parentesis {
    
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
                 stack.push(s.charAt(i));
            }else{
                if(s.charAt(i)==')'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    else if(stack.peek()=='(' & !stack.isEmpty()){
                        stack.pop();
                    }else{return false;}
                }
                else if(s.charAt(i)=='}'){
                     if(stack.isEmpty()){
                        return false;
                    }
                    else if(stack.peek()=='{' & !stack.isEmpty()){
                        stack.pop();
                    }else{return false;}
                }
                else if(s.charAt(i)==']'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    else if(stack.peek()=='[' & !stack.isEmpty()){
                        stack.pop();
                    }else{return false;}
                }
            }
        }

        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}
