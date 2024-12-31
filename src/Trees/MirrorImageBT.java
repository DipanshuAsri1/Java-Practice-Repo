package Trees;
/*
  I/P
        0
      /   \
    1       2
   /  \   /   \
  3    4  5    6

  -------------------
  O/P
        0
      /    \
    2        1
   /  \    /   \
  6    5   4    3

 */

public class MirrorImageBT {

    public static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(){
            left=null;
            right=null;
            value=0;
        }
    }

    public static void mirror_image(BinaryTreeNode root) {
        root = mirror_image_util(root);
    }

    //Recursive methoa
    public static BinaryTreeNode mirror_image_util(BinaryTreeNode root){
        if (root == null)
            return root;

        BinaryTreeNode left = mirror_image_util(root.left);
        BinaryTreeNode right = mirror_image_util(root.right);

        // Swap the left and right pointers.
        root.left = right;
        root.right = left;
        return root;
    }
    public static void main(String[] args) {


    }
}
