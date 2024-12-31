package Trees;

public class MaxDepthOfTree {
    BT root;
    static class BT{
        BT left;
        BT right;
        int value;

        BT(){
        }
        BT(int val){
            this.value=val;
            left=right=null;
        }

    }

    //try using recursion
    public static int maxDepth(BT root){

        int height=0;

        if(root==null) //base case
            return 0;
        else{
            int lDepth=maxDepth(root.left);
            int rDepth=maxDepth(root.right);

            if(lDepth>rDepth)
                return (lDepth+1);
            else
                return (rDepth+1);
        }

    }

    public static void main(String[] args) {

        MaxDepthOfTree tree = new MaxDepthOfTree();

        tree.root = new BT(1);
        tree.root.left = new BT(2);
        tree.root.right = new BT(3);
        tree.root.left.left = new BT(4);
        tree.root.left.right = new BT(5);

        System.out.println("Height of tree is "
                + tree.maxDepth(tree.root));
    }


}
