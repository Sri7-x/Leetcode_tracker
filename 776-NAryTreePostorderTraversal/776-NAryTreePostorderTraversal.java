// Last updated: 1/9/2026, 12:41:41 pm
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> log=new LinkedList<>();

    public List<Integer> postorder(Node root) {
        if(root!=null){
        for(int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i));
        }
            log.add(root.val);
        
        }
        return log;
    }
}