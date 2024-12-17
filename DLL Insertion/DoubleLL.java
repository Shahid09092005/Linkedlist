public class DoubleLL{

    // Node class of DLL
    public static class Node{
        int data; // data of node 
        Node next; // address of next node
        Node prev; // it store the address of previous address
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
            Node temp=new Node(val); //new Node
            if(head==null && tail==null){  // if ll is empty then head will point to temp
                head=temp;
            }else{
                temp.next=head;
                head.prev=temp;
                head=temp;
            }
        }
        
        //adding at end
        void insertEnd(int val){
            Node temp=new Node(val); // this node want to add at end of LL
            Node t=head;
            if(head==null){ // if DLL is empty
                head=temp;
            }
            // traversing untill we get the last node
            while(t.next!=null){
                t=t.next;
            } // get the last node
            t.next=temp; 
            temp.prev=t;
            tail=temp;
        }

        // insert after n'th index node
        void insertAfterIndex(int n , int val){
            int size=calSize();
            if(n<1 && n>size){
                System.out.println("Can't be added , check the size of the linkedlist");
            }
            Node curNode=new Node(val);
            Node temp=head;
            while(n>0){ // this will reach where we want to insert after nth index
                temp=temp.next;
                n--;
            } 
            temp.next.prev=curNode.next;
            curNode.prev=temp;
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
            temp.next.prev=curNode.next;
            curNode.prev=temp;
            curNode.next=temp.next;
            temp.next=curNode;  
        }

        //print DLL if no node to pass
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
        link.insertBegin(8);
        link.insertBegin(4);
        link.printLinkedlist();
        link.insertEnd(5);
        link.printLinkedlist();
        link.insertBegin(44);
        link.printLinkedlist();
        link.insertBegin(19);
        link.printLinkedlist();
        System.out.print("inserting '99' after 3 index(0base index), we get LL is ");
        link.insertAfterIndex(3, 99);
        link.printLinkedlist();
        System.out.print("inserting '101' after the value of 44, then get LL is ");
        link.insertAfterValue(44, 101);
        link.printLinkedlist();
        
    }
}
