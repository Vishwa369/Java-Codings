package LinkedList;

public class LinkedList1 <T>{
    private Node<T> head;
    private int size;

    private static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList1(){
        this.head = null;
        this.size = 0;
    }
    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if (this.head == null){
            head = newNode;
        }
        else{
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public void prepend(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void insert(int index, T data){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0){
            prepend(data);
            return;
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++){
            current = current.next;
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = current.next;
        current.next = newNode;

        size++;
    }
    public void deleteByValue(T data){
        if (head == null)return;
        if (head.data.equals(data)){
            head = head.next;
            size--;
            return;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)){
            current = current.next;
        }
        if (current.next != null){
            current.next = current.next.next;
            size--;
        }
    }
    public T deleteByIndex(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> toDelete;
        if (index == 0){
            toDelete = head;
            head = head.next;
        }else {
            Node<T> current = head;
            for (int i = 0; i < index -1; i++){
                current = current.next;
            }
            toDelete = current.next;
            current.next = toDelete.next;
        }
        size--;
        T deletedData = toDelete.data;
        toDelete.next = null;
        return deletedData;
    }
    public int size(){
        return size;
    }
    public T get(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
    public boolean contains(T data){
        Node<T> current = head;
        while (current != null){
            if (current.data.equals(data)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null){
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
    public static void main(String[] args){
        LinkedList1<String> list = new LinkedList1<String>();
        list.append("hello");
        list.append("hi");
        list.append("hey");
        list.append("yo");
        list.append("buddy");
        System.out.println(list);
        System.out.println(list.deleteByIndex(0));
    }
}
