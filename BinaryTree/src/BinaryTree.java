import java.util.Scanner;

/**
 * @Auther: liuyi
 * @Date: 2019/6/29 16:09
 * @Description:
 */
public class BinaryTree {

    public static void main(String[] args){

        TreeNode treeNode = createTree();
        System.out.println(treeNode);
    }

    public static  TreeNode createTree(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        TreeNode treeNode;
        if("#".equals(input)){
            return null;
        }else{
            treeNode = new TreeNode(input);
            treeNode.setLeft(createTree());
            treeNode.setRight(createTree());
        }
        return treeNode;
    }
}
