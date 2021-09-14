package trees_and_graphs;

public class MyTree {

    public void inOrderTransversal(TreeNode node) {
        if (node == null)
            return;
        inOrderTransversal(node.left);
        System.out.print(" " + node.data);
        inOrderTransversal(node.right);
    }

    public void preOrderTransversal(TreeNode node) {
        if (node == null)
            return;
        System.out.print(" " + node.data);
        preOrderTransversal(node.left);
        preOrderTransversal(node.right);
    }

    public void postOrderTransversal(TreeNode node) {
        if (node == null)
            return;
        postOrderTransversal(node.left);
        postOrderTransversal(node.right);
        System.out.print(" " + node.data);
    }
}

