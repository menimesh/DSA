public class LL {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }

    }
        //Represent the head and tail of the singly linked list    
        public Node head = null;    
        public Node tail = null; 
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode; 
    }
    public void addLast(String data){
        Node newNode=new Node(data);{
            if(head==null){
                head=newNode;
                return;
            }
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
        }
    }
    public static void main(String[] args) {
        LL ob=new LL();
        ob.addFirst("a");
        ob.addFirst("b");
    }
    
}
