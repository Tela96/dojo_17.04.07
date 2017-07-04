import org.w3c.dom.*;

public class Main {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        NodeList nl = new NodeList();
        nl.add(n1);
        nl.add(n2);
        nl.add(n3);
        nl.add(n4);
        nl.add(n5);
        nl.add(n6);
        nl.add(n7);
        nl.add(n8);

        nl.listNodes();
    }
}
