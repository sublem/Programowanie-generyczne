public class CustomList<T>
{
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
        return null;
    }
    public T getLast()
    {
        return null;
    }
    public T removeLast()
    {
        return null;
    }
    public T removeFirst()
    {
        return null;
    }


}
