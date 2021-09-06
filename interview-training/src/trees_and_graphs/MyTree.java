package trees_and_graphs;

public class MyTree {

    public void inOrderTransversal(TreeNode node, int i) {
        i++;
        if (node == null)
            return;
        inOrderTransversal(node.left, i);
        System.out.print(" " + node.data);
        inOrderTransversal(node.right, i);
        if (i == 1)
            System.out.println();
    }

    public void preOrderTransversal(TreeNode node, int i) {
        i++;
        if (node == null)
            return;
        System.out.print(" " + node.data);
        preOrderTransversal(node.left, i);
        preOrderTransversal(node.right, i);
        if (i == 1)
            System.out.println();
    }

    public void postOrderTransversal(TreeNode node, int i) {
        i++;
        if (node == null)
            return;
        postOrderTransversal(node.left, i);
        postOrderTransversal(node.right, i);
        System.out.print(" " + node.data);
        if (i == 1)
            System.out.println();
    }
}

