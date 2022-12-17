class Solution {
    public boolean isOperator(String s){
    return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }
    public int resultant(String s,int y,int x)
    {
        if (s.equals("+")){ return x+y;}
        else if (s.equals("-")){    return x-y;}
        else if (s.equals("*")){    return x*y;}
        else if (s.equals("/")){    return x/y;}
        return 0;
    }
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack=new Stack<>();
        for (String s:tokens)
        {
            if (isOperator(s))
                stack.push(resultant(s,stack.pop(),stack.pop()));   
            else
                stack.push(Integer.parseInt(s));
        }
        return stack.peek();
    }
}
