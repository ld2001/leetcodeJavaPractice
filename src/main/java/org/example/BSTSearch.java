package org.example;

import java.util.*;

public class BSTSearch {

    private static boolean nodeIsNull (TreeNode node) {
        if(node == null) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean hasChildren (TreeNode node) {
        if(node.left == null && node.right == null) {
            return false;
        } else {
            return true;
        }
    }

    private static int returnValInRange(TreeNode root, int LowerBound, int UpperBound) {
        if(root.val >= LowerBound && root.val <= UpperBound) {
            return root.val;
        } else {
            return 0;
        }
    }

    private static int returnSumWithChildren (TreeNode root, int LowerBound, int UpperBound) {
        int totalSumCounter = 0;

        if(root.left != null) {
            totalSumCounter += rangeSumBST(root.left,LowerBound,UpperBound);
        }
        if(root.right != null) {
            totalSumCounter += rangeSumBST(root.right,LowerBound,UpperBound);
        }

        totalSumCounter += returnValInRange(root,LowerBound,UpperBound);

        return totalSumCounter;
    }

    public static int rangeSumBST (TreeNode root, int L, int R) {
        if(nodeIsNull(root)) {
            return 0;
        } else {
            if(hasChildren(root)) {
                return returnSumWithChildren(root,L,R);
            } else {
                return returnValInRange(root,L,R);
            }
        }

    }

}
