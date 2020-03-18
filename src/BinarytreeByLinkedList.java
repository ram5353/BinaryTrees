import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
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
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                presentNode.setLeft(node);
                System.out.println("left");
                break;
            } else if (presentNode.getRight() == null) {
                presentNode.setRight(node);
                System.out.println("right");
                break;
            } else {
                 queue.add(presentNode.getLeft());
                 queue.add(presentNode.getRight());
            }
        }
    }

}
