
public class List {
    private Node head;
    private Node tail;

    public List(){
        head = null;
        tail = null;
    }
    private boolean isEmpty(){
        return head == null;
    }
    public void pushEnd(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            head = temp;
        }
        else {
            tail.setNext(temp);
            temp.setPrev(tail);
        }
        tail = temp;


    } public static void swap(Node node){
        Node prev = node.getPrev();
        node.setPrev(node.getNext());
        node.setNext(prev);
    }
    public  void reverse()
    {
        Node prev = null;
        Node curr = head;

        while (curr != null)
        {
            swap(curr);
            prev = curr;
            curr = curr.getPrev();
        }

        if (prev != null) {
            head = prev;
        }


    }

    public void pushFirst(int data){
        Node temp = new Node(data);

        if(isEmpty()){
            tail = temp;

        }
        else {
            head.setPrev(temp);

        temp.setNext(head);
        head = temp; }
    }
    public void removeEnd(){

        if(head.getNext() == null){
            tail = null;
        }
        else {
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
    }
    public void removeFirst(){

        if(head.getNext() == null){
            tail = null;
        }
        else {
            head.getNext().setPrev(null);
            head = head.getNext();
        }
    }

    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.getData());
            System.out.print( " -> ");
            temp = temp.getNext();
        }
    }




}
