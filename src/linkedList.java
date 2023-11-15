public class linkedList {
    private Node head;
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data){
        if (head == null)return;
        if (head.data == data){
            head = head.next;
            return;
        }
        Node current = head;

        while (current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args){
        linkedList l1 = new linkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);
        l1.prepend(5);
        l1.deleteWithValue(5);
        l1.printList();
    }
}
