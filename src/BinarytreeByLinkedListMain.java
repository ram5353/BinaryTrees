public class BinarytreeByLinkedListMain {

    public static void main(String[] args) {
        BinarytreeByLinkedList obj = new BinarytreeByLinkedList();

        System.out.println("Successfully insert 10 nodes into Tree");
        for (int i=0;i<=10;i++) {
            obj.insert(i*10);
        }
        obj.preOrder(obj.root);
        obj.inOrder(obj.root);

    }
}
