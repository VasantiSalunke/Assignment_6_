public class LinkedList {
    private Node head;
    public void add(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node n1 = head;
        while (n1.getNext() != null) {
            n1 = n1.getNext();
        }
        n1.setNext(newnode);
    }
    public void addfromfirst(int data){
        Node first = new Node(data);
        first.setNext(head);
        head = first;
    }

    public void addonposition(int data, int position) {
        Node previous = head;
        int i;
        for (i = 1; i < position; i++) ;
        if (i + 1 == position){
            previous.setData(data);
        }
        previous = previous.getNext();
    }

    public void removefromFirst(){
        if (head == null){
            System.out.println("Empty Linklist");
            return;
        }
        head = head.getNext();
    }
    public void deleteFromLast(){
        Node n1 = head;
        while(n1.getNext().getNext() != null) {
            n1 = n1.getNext();

        }
        n1.setNext(null);
    }
    public void display() {
        Node Display = head;

        while(Display != null) {
            System.out.println(Display.getData());
            Display = Display.getNext();
        }
    }
}

