package structures;

/**
 * Связный список.
 *
 * Односвязный список реализуется с помощью добавления в новый элемент ссылки на предыдущий.
 * Проблема в односвязном списке в том, что в нем можно пробежаться только в одну сторону, с конца.
 *
 * Двусвязный список сложнее тем, что нужно добавлять ссылку на следующий элемент, который не существует еще.
 * Это можно решить, пробегаясь по всем элементам и перекидывая ссылки, но тогда сложность добавления будет линейной.
 * Поэтому лучшее решение - это заранее создавать следующий элемент, а только потом при добавлении присваивать его этой ссылке.
 *
 */
public class LinkList <T> {
    public int size;
    private Element<T> head;
    private Element<T> tail; // след элемент, который мы создаем заранее.

    public void add(T t) {
        Element<T> newElement = new Element<>(t);
        if (head == null) {
            head = newElement;
            tail = newElement; // если список пуст, то элемент становится и первым и последним
            size++;
            return;
        }

        tail.next = newElement; // в последний элемент, мы добавляем ссылку на добавляемых объект
        newElement.prev = tail; // в добавляемый объект добавляем ссылку на предыдущий последний элемент
        tail = newElement; // и назначаем наш объект последним

        size++; // увеличиваем размер списка
    }

    public T get(int i) {
        Element<T> currentElement = head;
        int pointer = 0;
        while (pointer != i) {
            currentElement = currentElement.next;
            pointer++;
        }
        return currentElement.value;
    }

    public void put(T t, int i) {
        Element<T> currentElement = head;
        int pointer = 0;
        while (pointer != i) {
            currentElement = currentElement.next;
            pointer++;
        }
        Element<T> insertableElement = new Element<>(t);
        currentElement.prev.next = insertableElement;
        insertableElement.next = currentElement;
        insertableElement.prev = currentElement.prev;
        size++;
    }

    public void remove(int i) {
        Element<T> currentElement = head;
        int pointer = 0;
        while (pointer != i) {
            currentElement = currentElement.next;
            pointer++;
        }
        currentElement.prev.next = currentElement.next;
        size--;
    }


    public static class Element <T>{
        T value;
        Element<T> prev;
        Element<T> next;

        public Element(T value) {
            this.value = value;
        }
    }
}

