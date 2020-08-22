package org.example;

import sun.reflect.generics.tree.Tree;

public class BSTSearch {

    private static boolean nodeIsNull (TreeNode node) {
        if(node == null) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean hasChildren (TreeNode node) {
        return true;
    }

    public static int rangeSumBST (TreeNode root, int L, int R) {
        if(nodeIsNull(root)) {
            return 0;
        } else {
            if(hasChildren(root)) {
                return -1;
            } else {
                return 0;
            }
        }

    }

}
