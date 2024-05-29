// break the linekdlsit
// reverse the seocnd liisit
// compare

public class Palindrome{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
                
            }
        }
        Node head1 = slow.next;
        slow.next = null;

        Node head2 = reverse(head1);
        Node temp1 = head;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;

    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
        return head;

    }
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(1);
        // Node sixth = new Node(60);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // fifth.next = sixth;
        Node head = first;
        
        print(head);
        System.out.println();
        System.out.println(isPalindrome(head));

        
    }
}