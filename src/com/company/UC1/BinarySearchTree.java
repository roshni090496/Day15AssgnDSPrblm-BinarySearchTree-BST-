/**********************************************************************************************************************************************************************
 *
 * Ability to create a BST by adding 56 and then adding 30 & 70
 * Use INode to create My Binary Node
 * Note the key has to extend comparable to compare and determine left or right node
 * First add 56 as root node so 30 will be added to left and 70 to right
 *
 * @author : Roshni Singh
 *
 *********************************************************************************************************************************************************************/
package com.company.UC1;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {

    }
    // Adding the new Nodes to Tree
    public void insert(int data) {
        Node newNode = new Node(data);

        if(root == null) {
            root = newNode;
            return;
        }
        else {
            Node current = root;
            Node parent = null;
            while(true) {
                parent = current;
                if(data < current.data) {   // 30 < 56
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Print the All Nodes in Tree
    public void inorderTraversal(Node node) {
        if(root == null)
            System.out.println("Tree is empty");
        else {
            if(node.left != null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right != null)
                inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binary = new BinarySearchTree();

        binary.insert(56);
        binary.insert(30);
        binary.insert(70);

        binary.inorderTraversal(binary.root);
    }
}