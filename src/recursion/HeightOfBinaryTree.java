package recursion;

public class HeightOfBinaryTree {

    static class TreeNode{
        int data;
        TreeNode left ;
        TreeNode right;
        int val;
        TreeNode(int data){
         this.data=data;
         left=null;
         right=null;
        }
    }

    //Using IBH Method ( Induction base , hypothesis )
    /* step 1) : hypothesis  height(root) - > height
                                    height ( root->left) - Height of left subtree
                                    height(root->right ) - height of right subtree
           2) Induction
               return 1 + max( lh , rh ) ;

           3) base ( Think of smallest valid input )

              0 node ( returns null), 1 node ( return 1 )  , 2 node
     */

    public static int height (TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return 1 + Math.max(lh,rh);
    }

    public static void main(String[] args) {

        TreeNode treeNode=new TreeNode(12);
        treeNode.left=new TreeNode(10);
        treeNode.right=new TreeNode(5);

        treeNode.left.left=new TreeNode(19);
        treeNode.right.right=new TreeNode(20);
        System.out.println(height(treeNode));


    }
}
