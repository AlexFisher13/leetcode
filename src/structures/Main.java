package structures;

public class Main {
    public static void main(String[] args) {
        LinkList<String> list = new LinkList<>();
        list.add("Саша");
        list.add("Юля");
        list.add("Тимур");
        list.put("Женя", 2);
        list.remove(2);

        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }

        BinaryThree tree = new BinaryThree();
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(2);
        tree.insert(9);
        tree.insert(1);
        tree.insert(4);
        tree.insert(3);
        tree.printTree();
    }
}
