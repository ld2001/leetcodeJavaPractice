package org.example;

import org.junit.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

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


}
