import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Auther: liuyi
 * @Date: 2019/6/27 20:03
 * @Description:
 */
public class Solution {

    public String replaceSpace(StringBuffer str) {
        if(str.length() == 0){
            return str.toString();
        }
        int num = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                num++;
            }
        }
        int i = str.length()-1;
        str.setLength(str.length()+num*2);
        int j = str.length()-1;
        while(i>=0 && i < j){
            if(str.charAt(i)!=' '){
                str.setCharAt(j,str.charAt(i));
                i--;
                j--;
                continue;
            }
            str.setCharAt(j--,'0');
            str.setCharAt(j--,'2');
            str.setCharAt(j--,'%');
            i--;
        }
        return str.toString();
    }

    class ListNode{
        private int val;
        private ListNode next = null;
        public ListNode(int val){
            this.val=val;
        }

        public int getVal() {
            return val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if(listNode == null){
            return res;
        }
        res.add(listNode.getVal());
        LinkedList<Integer> stack = new LinkedList<>();
        ListNode temp = listNode;
        while(temp!=null){
             stack.push(temp.getVal());
             temp = temp.getNext();
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }

    class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
    }

    public String serialize(TreeNode root) {
        // write your code here
        TreeNode t = root;
        String result = "";
        StringBuilder sb = new StringBuilder("{");
        Queue<TreeNode> queue = new ConcurrentLinkedQueue<>();
        if(t == null){
            return result;
        }
        queue.offer(t);
        while(!queue.isEmpty()){
            TreeNode head = queue.poll();
            if(head != null){
                sb.append(String.valueOf(head.val)+",");
                queue.offer(head.left);
                queue.offer(head.right);
            }else{
                sb.append("#,");
            }
        }
        result = sb.substring(0,sb.length()-1).concat("}");
        return result;
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        if(data == null){
            return null;
        }
        Queue<TreeNode> queue = new ConcurrentLinkedQueue<>();
        String node = data.substring(1,data.length()-1);
        String[] nodes = node.split(",");
        int index = 0;
        TreeNode root = new TreeNode(Integer.valueOf(nodes[index++]));
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode t = queue.poll();
            if("#".equals(nodes[index++])){
                t.left = null;
            }else{
                t.left = new TreeNode(Integer.valueOf(nodes[index++]));
                queue.offer(t.left);
            }
            if("#".equals(nodes[index++])){
                t.right = null;
            }else{
                t.right = new TreeNode(Integer.valueOf(nodes[index++]));
                queue.offer(t.right);
            }
        }
        return root;
    }

    public static void main(String[] args){

        Solution solution = new Solution();
        ListNode listNode = solution.new ListNode(3);
        System.out.println("节点0初始 " + listNode);

        Queue<ListNode> queue = new ConcurrentLinkedQueue<>();
        System.out.println(queue);

        ListNode listNode1 = listNode;
        System.out.println("节点1 " + listNode);

        //
        queue.offer(listNode1);
        System.out.println("队列 " + queue);
        listNode = null;

        System.out.println("节点0 更新" + listNode);
        System.out.println("节点1 更新" + listNode1);
        System.out.println("队列 更新" + queue.peek());


        System.out.println(queue.peek().getVal());



//        LinkedList<Integer> stack = new LinkedList<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//
//        Queue<Integer> queue2 = new ConcurrentLinkedQueue<>();
//        queue2.offer(2);
//        queue2.offer(3);
//        queue2.offer(4);
//        queue2.poll();
//        System.out.println(queue2.peek());

    }




}
