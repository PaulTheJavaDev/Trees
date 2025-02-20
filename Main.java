public class Main {

    public static void main(String[] args) {

        /*
        -Big Thanks to CS Dojo with https://www.youtube.com/watch?v=1-l_UOFi1Xw&t=13s
         for making me learn the basics of Java Trees
         */

        // Our example tree looks like this:
        //         2
        //       /   \
        //      3     4
        //     / \
        //    5   6

        //defining the different Nodes
        Node root = new Node(2);
        Node child1 = new Node(3);
        Node child2 = new Node(4);
        Node child3 = new Node(5);
        Node child4 = new Node(6);

        //Assigning the Nodes to the matching Positions in the Tree
        root.left = child1;
        root.right = child2;
        child1.left = child3;
        child1.right = child4;

        //Now we are printing out the Sum of the Tree
        System.out.println("The Sum of the Tree is: " + sumOfTree(root));

    }

    static int sumOfTree(Node root) {
        //Check if the Tree is empty
        if (root == null) {
            return 0;
        }

        //Recursively return the sum of the root's data and the sum of its left and right subtrees
        return root.data + sumOfTree(root.left) + sumOfTree(root.right);
    }

}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
