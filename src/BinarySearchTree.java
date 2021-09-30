class BinarySearchTree {
    class Node {
        int key;
        Node left, right;

        public Node(int data){
            key = data;
            left = right = null;
        }
    }
    Node root;

    BinarySearchTree(){
        root = null;
    }

    int minValue(Node root)  {
        int minval = root.key;
        while (root.left != null)  {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    void insert(int key)  {
        root = insert_Recursive(root, key);
    }

    Node insert_Recursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key)
            root.right = insert_Recursive(root.right, key);

        return root;
    }

    // method for inorder traversal of BST
    void inorder() {
        inorder_Recursive(root);
    }


    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }

    boolean search(int key)  {
        root = search_Recursive(root, key);
        if (root!= null)
            return true;
        else
            return false;
    }

    Node search_Recursive(Node root, int key)  {
        if (root==null || root.key==key)
            return root;
        if (root.key > key)
            return search_Recursive(root.left, key);
        return search_Recursive(root.right, key);
    }
}
public class SearchElement {

    public static void main(String[] args)  {
        SearchElement bst = new SearchElement();

        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(22);
        bst.insert(40);
        bst.insert(11);
        bst.insert(3);
        bst.insert(16);
        bst.insert(60);
        bst.insert(95);
        bst.insert(65);
        bst.insert(63);
        bst.insert(67);

        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();

        boolean ret_val = bst.search (63);
        System.out.println("\nKey 50 found in BST:" + ret_val );

    }
}