/**
 * @Auther: liuyi
 * @Date: 2019/6/29 16:07
 * @Description:
 */
public class TreeNode {

    private String value;

    private TreeNode left = null;
    private TreeNode right = null;

    public TreeNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
