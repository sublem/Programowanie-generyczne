import java.util.AbstractList;

public class CustomList<T> extends AbstractList<T>
{
    @Override
    public T get(int index) {
        if (index < 0 || index >= size)
            return null;
        Node<T> current = head;
        for(int i = 0; i < index; i++)
        {
        current = current.next;
        }
        if (current !=null)
            return current.value;
        else
            return null;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<T>
    {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head, tail;
    private int size=0;
    public void addLast(T value )
    {
        Node<T> newNode = new Node<>(value);
        if (size==0)
        {
            head = tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void addFirst(T value)
    {
        Node<T> newNode = new Node<>(value);
        if (size==0)
        {
            head = tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public T getFirst()
    {
        if (size==0)
            return null;
        return head.value;
    }
    public T getLast()
    {
        if (size==0)
            return null;
        return tail.value;
    }
    public T removeLast()
    {
        if (size==0)
            return null;
        T deletedValue = tail.value;
        if (size==1) {
            head = tail = null;
            size--;
            return deletedValue;
        }
        Node<T> current = head;
        while(current.next != tail)
        {
            current = current.next;
        }
        tail = current;
        tail.next =null;
        size--;
        return deletedValue;
    }
    public T removeFirst()
    {
        if (size==0)
            return null;
        T value = head.value;
        if (size==1) {
            head = tail = null;
            size--;
            return value;
        }
        head = head.next;
        size--;
        return value;
    }


}

