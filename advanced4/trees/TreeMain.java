package advanced4.trees;

public class TreeMain {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Traversal.levelOrderTraversal(root);   
    }
    
}
