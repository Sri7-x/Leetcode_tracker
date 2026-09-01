// Last updated: 1/9/2026, 12:43:30 pm
class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            System.out.println(ch);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((ch==')' && top!='(')||
                (ch==']' && top!='[')||
                (ch=='}' && top!='{')){
                    return false;
                }
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }
}
