package org.example.binary_tree;

import java.util.Arrays;
import java.util.Stack;

public class BianLiTRee {

    /**
     * 前序遍历 递归
     * @param root
     */
    public static void preAnaTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preAnaTree(root.left);
        preAnaTree(root.right);
    }

    /**
     * 前序遍历 栈
     * @param root
     */
    public static void preAnaTreeStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            System.out.println(pop.val);
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }

    /**
     * 中序遍历 递归
     * @param root
     */
    public static void inAnaTree(TreeNode root) {
        if (root == null) {
            return;
        }
        inAnaTree(root.left);
        System.out.println(root.val);
        inAnaTree(root.right);
    }

    /**
     * 后序遍历 递归
     * @param root
     */
    public static void postAnaTree(TreeNode root) {
        if (root == null) {
            return;
        }
        postAnaTree(root.left);
        postAnaTree(root.right);
        System.out.println(root.val);
    }


    public static void main(String[] args) {
        String [] arr = {"A","B","D","E","C"};
        System.out.println(String.join(",", Arrays.asList(arr)));
        TreeNode d = new TreeNode("D", null, null);
        TreeNode e = new TreeNode("E", null, null);
        TreeNode c = new TreeNode("C", null, null);
        TreeNode b = new TreeNode("B", d, e);
        TreeNode a = new TreeNode("A", b, c);

        preAnaTree(a);
        System.out.println("===========");
        preAnaTreeStack(a);
//        System.out.println("===========");
//        inAnaTree(a);
//        System.out.println("===========");
//        postAnaTree(a);
    }
}
