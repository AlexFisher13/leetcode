package structures;

/**
* Бинарное несбалансированное дерево
 * */

public class BinaryThree {
    private Node root;

    // Метод для вставки нового узла в дерево
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // Рекурсивная вспомогательная функция для вставки узла в дерево
    private Node insertRec(Node root, int value) {
        // Если дерево пустое, создаем новый узел
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Иначе рекурсивно идем либо влево, либо вправо в зависимости от значения ключа
        if (value < root.value)
            root.leftChild = insertRec(root.leftChild, value);
        else if (value > root.value)
            root.rightChild = insertRec(root.rightChild, value);

        // Возвращаем измененный указатель на узел
        return root;
    }

    public void printTree() {
        printTreeRec(root, 0);
    }

    // Рекурсивная вспомогательная функция для вывода дерева в консоль
    private void printTreeRec(Node root, int depth) {
        if (root == null)
            return;

        // Рекурсивно обходим правое поддерево
        printTreeRec(root.rightChild, depth + 1);

        // Выводим отступы в зависимости от глубины уровня
        for (int i = 0; i < depth; i++)
            System.out.print("   ");

        // Выводим значение узла
        System.out.println(root.value);

        // Рекурсивно обходим левое поддерево
        printTreeRec(root.leftChild, depth + 1);
    }

    public static class Node {
        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }
}
