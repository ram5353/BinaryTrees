import java.util.LinkedList;
import java.util.Queue;

public class BinarytreeByLinkedList {

    BinaryNode root;
    BinarytreeByLinkedList() {
        this.root = null;
    }

    void insert(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        if (root == null) {
            root = node;
            System.out.println("node is successfully inserted");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                presentNode.setLeft(node);
                System.out.println("left" + node.getValue());
                System.out.println(node.getLeft());
                break;
            } else if (presentNode.getRight() == null) {
                presentNode.setRight(node);
                System.out.println("right" + node.getValue());
                break;
            } else {
                 queue.add(presentNode.getLeft());
                 queue.add(presentNode.getRight());
            }
        }
    }

    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getValue() + " ");
        inOrder(node.getRight());
    }

    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        inOrder(node.getRight());
        System.out.print(node.getValue() + " ");
    }

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode present = queue.remove();
            System.out.print(present.getValue() + " ");
            if (present.getLeft() != null) {
                queue.add(present.getLeft());
            }
            if (present.getRight() != null) {
                queue.add(present.getRight());
            }
        }
    }

    void search(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getValue() == value) {
                System.out.println("Found the value = " + presentNode.getValue());
                return;
            } else {
                if (presentNode.getLeft()!=null) {
                    queue.add(presentNode.getLeft());
                }
                if (presentNode.getRight()!=null)
                    queue.add(presentNode.getRight());
            }
        }
        System.out.println("Value not found");
    }
}
