package org.example;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class BSTSearchTest {


    @Test
    public void testRootIsNull () {

        assertThat(BSTSearch.rangeSumBST(null,0,0),equalTo(0));
    }

    @Test
    public void testNoChild () {
        TreeNode noChildNode = new TreeNode(2);
        assertThat(BSTSearch.rangeSumBST(noChildNode,0,4),equalTo(2));
    }


    @Test
    public void test3NodesEquals5 () {
        TreeNode L1 = new TreeNode(2);
        L1.left = new TreeNode(6);
        L1.left = new TreeNode(3);

        assertThat(BSTSearch.rangeSumBST(L1,0,4),equalTo(5));
    }


    @Test
    public void test3NodesDegenerate () {
        TreeNode L1 = new TreeNode(2);
        L1.left = new TreeNode(6);
        L1.left.left = new TreeNode(3);

        assertThat(BSTSearch.rangeSumBST(L1,0,4),equalTo(5));
    }

    @Test
    public void test3NodesDegenerateNegative () {
        TreeNode L1 = new TreeNode(2);
        L1.left = new TreeNode(-3);
        L1.left.left = new TreeNode(3);

        assertThat(BSTSearch.rangeSumBST(L1,0,4),equalTo(5));
    }

}


