package trees_and_graphs;

import static trees_and_graphs.MinimalTree.createMinimalBST;

public class Succession {

   public static TreeNode inorderSuccession(TreeNode n) {
        if (n == null) return null;

        if (n.right != null) {
            return leftMostChild(n.right);
        } else {
            TreeNode q = n;
            TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q =x;
                x = x.parent;
            }
            return x;
        }
    }

    public static TreeNode leftMostChild(TreeNode n) {
        if (n == null) {
            return null;
        }
        while (n.left != null) {
            n = n.left;
        }
        return n;
    }

    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6};
        TreeNode node = createMinimalBST(array);

        System.out.println(inorderSuccession(node));
    }
}
