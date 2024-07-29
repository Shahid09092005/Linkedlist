public class start{

    public static class Node{   //static class of Node
        int data;   // Node data's type
        Node next;  // Next address of Node or reference of next node
        Node(int data){  // Constructor of class'node
            this.data=data;
        }
    }

    public static class Linkedlist{
        Node head=null;
        Node tail=null;

        //deletion at beginning
        void delBegin(){
            if(head==null){
                System.out.println("Can't be deleted because linkedlist is empty");
            }
            head=head.next;
        }

        //deletion at end
        void delEnd(){
            if(head==null && tail==null){
                System.out.println("Can't be deleted the empty linked list");
            }
            if(head.next==null){ // if there is only one node in the linkedlist
                head=head.next;
            }
            // more than one node present in linkedlist
            Node temp=head;
            Node pre=null;
            while(temp.next!=null){ //stop iteration to the second last node
                pre=temp;
                temp=temp.next;
            }
            // points the second last to null
            pre.next=null;
            tail=pre;
        }

        //deletion a node on the given postion 
        void delPosition(int pos){
            int size=calSize();
            if(pos<1 || pos>size){
                System.out.println("Invalid postion is given");
                System.out.println("The size of linkedlist is "+size);
                return;
            }
            if(pos==1){  // if the pos is 1 means only one node is present
                head=head.next;
                return;
            }
            Node temp=head;
            Node pre=null;
            for(int i=1;i<pos;i++){
                pre=temp;
                temp=temp.next;
            }
            pre.next=temp.next;
        }

        // deletion on the basis of value
        void delValue(int val){
            //if linkedlist is empty
            if(head==null || tail==null){
                System.out.println("Linked list is empty");
            }
            Node temp=head;
            Node pre=null;
            // if head is not null but have the head have that 'val' we want to delete.
            if(temp !=null &&temp.data==val){
                head=temp.next; //change the head
                return;
            }
            // Traverse the linkedlist
            while(temp!=null && temp.data!=val){
                pre=temp;
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Value is not found in Linkedlist !!");
                return;
            }

            pre.next=temp.next;

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

        //print linked linkedlist
        void printLinkedlist(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }

        // add element at begin
        void insertBegin(int val){
            Node curNode=new Node(val);
            if(head==null && tail==null){
                head=curNode;
            }else{
                curNode.next=head;
                head=curNode;
            }    
        }
        

    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertBegin(10);
        ll.insertBegin(20);
        ll.insertBegin(30);
        ll.insertBegin(40);
        ll.insertBegin(50);
        ll.insertBegin(60);
        ll.insertBegin(70);
        ll.insertBegin(80);
        ll.insertBegin(90);
        ll.insertBegin(100);

        System.out.println();
        System.out.print("Current element in the linked list ");
        ll.printLinkedlist();
        System.out.println("Size of the linkedlist is "+ll.calSize());
        System.out.println();

        ll.delBegin(); // deleting the begin element in the ll
        System.out.print("After deleting the beginning element in ll we get ");
        System.out.print("Current linkedlist ");
        ll.printLinkedlist();
        System.out.println("Current size of linkedlist is "+ll.calSize());
        System.out.println();

        ll.delEnd(); // deleting the begin element in the ll
        System.out.print("After deleting the end element in ll we get ");
        System.out.print("Current linkedlist ");
        ll.printLinkedlist();
        System.out.println("Current size of linkedlist is "+ll.calSize());
        System.out.println();

        System.out.print("After deleting 1st position in ll we get ");
        ll.delPosition(1); // deleting the begin element in the ll
        System.out.print("Current linkedlist ");
        ll.printLinkedlist();
        System.out.println("Current size of linkedlist is "+ll.calSize());
        System.out.println();

        System.out.print("After deleting 2nd position in ll we get ");
        ll.delPosition(2); // deleting the begin element in the ll
        System.out.print("Current linkedlist ");
        ll.printLinkedlist();
        System.out.println("Current size of linkedlist is "+ll.calSize());
        System.out.println();

        System.out.print("After deleting 2nd position in ll we get ");
        ll.delPosition(2); // deleting the begin element in the ll
        System.out.print("Current linkedlist ");
        ll.printLinkedlist();
        System.out.println();

        System.out.print("After deleting 30 value in ll we get ");
        ll.delValue(30); // deleting the begin element in the ll
        System.out.print("Current linkedlist ");
        ll.printLinkedlist();
        System.out.println();
        
        System.out.print("After deleting 2000 value in ll we get ");
        ll.delValue(2000); // deleting the begin element in the ll
        System.out.println();
        System.out.print("Current linkedlist ");
        ll.printLinkedlist();
        System.out.println();
    }
}