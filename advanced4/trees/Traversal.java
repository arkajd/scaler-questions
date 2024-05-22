package advanced4.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    public static void preOrderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

    public static void postOrderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        System.out.println(node.data);
    }

    public static void inOrderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        preOrderTraversal(node.left);
        System.out.println(node.data);
        preOrderTraversal(node.right);
    }

    public static void levelOrderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();

            if(temp!=null){
                System.out.print(temp.data);
                System.out.print(" ");
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                
            }
            else{
                queue.add(null);
                System.out.println();
            }

            if(queue.size()==1){
                break;
            }
        }
    }
    
}
