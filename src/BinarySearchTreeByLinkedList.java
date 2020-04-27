import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList {

    BinaryNode root;

    public BinarySearchTreeByLinkedList(BinaryNode root) {
        this.root = null;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public BinaryNode createNewNode(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        return node;
    }

    public void searchValue(int value) {
        searchForValue(root, value);
    }

    public BinaryNode searchForValue(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("value not found");
            return null;
        } else if (node.getValue() == value) {
            System.out.println("found the value");
            return node;
        } else if (node.getValue() < value) {
            return searchForValue(node.getLeft(), value);
        } else {
            return searchForValue(node.getRight(), value);
        }
    }

    public void TreeTraversal(BinaryNode node) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.getValue());
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
    }


}

