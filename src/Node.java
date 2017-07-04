
public class Node
{
    private int data;
    private Node next;
    private Node slow;
    private Node fast;

    public Node(int data)
    {
        this.data = data;
        next = null;
    }

    public Node next()
    {
        return next;
    }

    public boolean hasNext()
    {
        return (next != null);
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getNext(Node next)
    {
        return next;
    }

    public int getData()
    {
        return data;
    }

}
