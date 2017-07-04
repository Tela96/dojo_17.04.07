import java.util.ArrayList;
import java.util.List;

/**
 * Created by akos on 2017.07.04..
 */
public class NodeList
{
    private List<Node> storage = new ArrayList<>();
    private Node head = null;

    public void add(Node node)
    {
        if (storage.size() != 0)
        {
            storage.get(storage.size()-1).setNext(node);
            storage.add(node);
        }
        else
        {
            storage.add(node);
            head = storage.get(0);
        }
    }

    public boolean hasLoop()
    {
        return head.hasNext();
    }

    public void listNodes()
    {
        while (hasLoop())
        {
            if (head != null)
            {
                System.out.println(head.getData());
            }
            head = head.next();
        }
    }

    public Node next()
    {
       return head.next();
    }

}
