import java.util.Scanner;

public class CircularLL {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail=null;
    void insertionCircularLl() {
        int n = 0;
        do {
            System.out.println("Enter data for insertion");
            int data = new Scanner(System.in).nextInt();
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                tail=newnode;
                newnode.next=head;

                System.out.println(data + "inserted successfully");
            } else {
                System.out.println("Enter your choice for Insertion");
                System.out.println("\n1. At beg \n2. At Specific Location \n3. At end");
                int m = new Scanner(System.in).nextInt();
                switch (m) {
                    case 1:

             newnode.next=head;
           head=newnode;
          tail.next=head;
            break;

                    case 2:
                        Node temp_mid = head;
                        Node ptr = temp_mid.next;
                        System.out.println("Enter position for insertion");
                        int p = new Scanner(System.in).nextInt();
                        for (int i = 0; i < (p - 2); i++) {
                            temp_mid = ptr;
                            ptr = ptr.next;
                        }
                        newnode.next=temp_mid.next;
                        temp_mid.next=newnode;
                        break;


                    case 3:
tail.next=newnode;
tail=newnode;
newnode.next=head;
                        break;


                    default:
                        System.out.println("Press enter valid choice");
                }
                System.out.println(data + "inserted successfully");
            }
            System.out.println("Press 1 for continue insertion, else press any key");
            n = new Scanner(System.in).nextInt();
        } while (n == 1);

    }


    // method to display all nodes
    void displayCircularLL() {
        if (head == null && tail==null) {
            System.out.println("Linked List is empty, so no data is displayed");
        }
        else {
            Node temp = head;

          do{
               System.out.println(temp.data);
               temp=temp.next;
           } while(temp!=head);
        }
    }

    //deletion
    void deletionCircular() {
        int n = 0;
        do {
//            System.out.println("Enter data for deletion");


            if (head == null && tail==null) {

                System.out.println("Linked list empty, not able to delete data ");
            } else {
                int data=0;
                System.out.println("Enter your choice for Deletion");
                System.out.println("\n1. At beg \n2. At Specific Location \n3. At end");
                int m = new Scanner(System.in).nextInt();
                switch (m) {
                    case 1:
                       data = head.data;
                       head=head.next;
                       tail.next=head;
                        break;

                    case 2:

                        Node temp_mid=head;
                        Node ptr_mid=temp_mid.next;
                        System.out.println("Enter position for Insertion");
                        int p=new Scanner(System.in).nextInt();
                        for (int i = 0; i <(p-2) ; i++) {
                            temp_mid=ptr_mid;
                            ptr_mid=ptr_mid.next;
                        }
                        data= ptr_mid.data;
                        temp_mid.next=ptr_mid.next;
                        break;


                    case 3:
                       Node temp=head;
                       Node ptr=temp.next;
                       do{
                           temp=ptr;
                           ptr=ptr.next;
                       }
                       while(ptr.next!=head);
                       data= ptr.data;
                       temp.next=head;
                       tail=temp;
                        break;


                    default:
                        System.out.println("Press enter valid choice");
                }

                System.out.println(data+"successfully deleted");
            }
            System.out.println("Press 1 for continue deletion, else press any key");
            n = new Scanner(System.in).nextInt();
        } while (n == 1);
    }


    void Even_NodesCircular() {
        if (head == null) {
            System.out.println("Linked List is empty, so no data is displayed");
        } else {
            System.out.println("\n.....Even NUMBER NODES....");
            int count=0;
            Node temp = head;
            do {
                count++;

                if(count%2==0){
                    System.out.println(temp.data);
                }
                temp = temp.next;
            }   while (temp != head);

        }
    }

     void Max_FindCircular() {
         if (head == null && tail==null) {
             System.out.println("Linked List is empty, NOT able to find max because there is no element");
         }

         else {
             int max = Integer.MIN_VALUE;
             Node temp = head;
             do{
                 if (temp.data > max) {
                     max = temp.data;

                 }
                 temp = temp.next;
             }while (temp != head) ;
             System.out.println("Max Element: " + max);
         }
    }

    void Odd_Nodes_Circular() {
        if (head == null) {
            System.out.println("Linked List is empty, so no data is displayed");
        } else {
            System.out.println("\n.....ODD NUMBER NODES....");
            int count=0;
            Node temp = head;
         do {
                count++;

                if(count%2!=0){
                    System.out.println(temp.data);
                }
                temp = temp.next;
            }   while (temp != head);

        }
    }

     void Min_FindCircular() {
         if (head == null && tail==null) {

                 System.out.println("Linked List is empty, NOT able to find min because there is no element");

         }
         else
         {
             int min=Integer.MAX_VALUE;
             Node temp=head;
            do{
                 if(temp.data<min){
                     min=temp.data;
                 }
                 temp=temp.next;
             }
            while (temp!=head);

            System.out.println("Min Element: "+min);
         }
    }

    void count_NodesCircular() {
        if (head == null && tail==null) {
            System.out.println("Linked List is empty, so no data is displayed");
        }
        else {
            Node temp = head;
            int count =0;

            do{
               count++;
                temp=temp.next;
            } while(temp!=head);
            System.out.println("Toatl Nodes: "+count);
        }
    }

    public static void main(String[] args) {
        CircularLL c=new CircularLL();



        int n=0;
        do {
            System.out.println("Enter your choice for operations \n1 For insertion \n2 For Deletion" +
                    "\n3 For Display \n4 For Count Nodes \n5 Max  \n6 Min \n7 Even_Nodes  \n8 OddNodes" );
            System.out.println("Please Enter: ");
            int m=new Scanner(System.in).nextInt();
            switch (m) {
                case 1:
                    c.insertionCircularLl();;
                    break;


                case 2:
                    c.deletionCircular();
                    break;

                case 3:
                  c.displayCircularLL();
                    break;

                case 4:
                   c.count_NodesCircular();
                    break;

                case 5:
                    c.Max_FindCircular();
                    break;

                case 6:
                   c.Min_FindCircular();
                    break;

                case 7:
                    c.Even_NodesCircular();
                    break;


                case 8:
                    c.Odd_Nodes_Circular();
                    break;

                default:
                    System.out.println("Please Enter Valid choice");


            }

            System.out.println("Press 100 for continue operations, else press any key");
            n = new Scanner(System.in).nextInt();
        }
        while (n==100);
    }




}

