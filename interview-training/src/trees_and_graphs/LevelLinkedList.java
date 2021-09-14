package trees_and_graphs;

import java.util.ArrayList;
import java.util.LinkedList;

import static trees_and_graphs.MinimalTree.createMinimalBST;

public class LevelLinkedList {
    public static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
        if (root == null) return;
        LinkedList<TreeNode> list;
        if (lists.size() == level) {
            list = new LinkedList<>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }

    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6};
        ArrayList<LinkedList<TreeNode>> lists = createLevelLinkedList(createMinimalBST(array));
        for(LinkedList<TreeNode> list : lists){
          for(int i=0;i<list.size();i++){
              System.out.print(list.get(i).data+" ");
          }
            System.out.println("");
        }

    }

}
