public class begin{
    // Node class
    public static class Node{
        int data; // data of node
        Node next; // address of next node
        Node(int data){
            this.data=data;
        }
    }

    // linkedlist class
    public static class linkedlist{
        Node head=null;  
        Node tail=null;

        // at the beginning method's linkedlist class
        void insertBegin(int val){
            Node currNode=new Node(val);
            if(head==null && tail==null){  // if ll is empty
                head=currNode;
            }else{
                currNode.next=head;
                head=currNode;
            }
        }
        
        //adding at end
        void insertEnd(int val){
            Node curNode=new Node(val);
            Node temp=head;
            if(head==null){ //
                head=curNode;
            }
            while(temp.next!=null){ // it reaches until the last node points to null
                temp=temp.next;
            }
            temp.next=curNode;
            tail=curNode;
        }

        // insert after n'th index node
        void insertAfterIndex(int n , int val){
            int size=calSize();
            if(n<1 && n>size){
                System.out.println("Can't be added , check the size of the linkedlist");
            }
            Node curNode=new Node(val);
            Node temp=head;
            while(n>0){
                temp=temp.next;
                n--;
            }
            curNode.next=temp.next;
            temp.next=curNode;
        }

        // insert after n'th index node
        void insertAfterValue(int old_val , int new_val){        
            Node curNode=new Node(new_val);
            Node temp=head;
            while(temp.data !=old_val){
                temp=temp.next;
            }
            curNode.next=temp.next;
            temp.next=curNode;   
        }

        //print
        void printLinkedlist(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        // size of the linkedlist
        int calSize(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;

        }
    } 


    public static void main(String[] args){
        linkedlist link=new linkedlist();
        link.insertBegin(10);
        link.insertBegin(20);
        link.insertBegin(30);
        link.insertBegin(40);
        link.insertEnd(100);
        link.printLinkedlist();
        link.insertAfterIndex(3, 99);
        link.printLinkedlist();
        link.insertAfterValue(99, 101);
        link.printLinkedlist();
        
    }
}