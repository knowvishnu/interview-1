package com.interview.leetcode.tree;

import com.interview.leetcode.utils.TreeNode;
import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-13
 * Time: 下午3:16
 */
public class MaximumPathSumTest extends TestCase {
    TreePath.MaximumPathSum finder = new TreePath.MaximumPathSum();
    public void testMaxPathSum() throws Exception {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        assertEquals(6, finder.maxPathSum(root));
    }
}
