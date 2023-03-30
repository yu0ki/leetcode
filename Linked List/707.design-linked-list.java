

/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

// @lc code=start
class MyLinkedList {
    Node head;
    int length;

    class Node {
        int val;
        Node next;

        public Node (int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }
    
    public int get(int index) {
        // エッジケースの処理
        if (index >= length || length == 0) {
            return -1;
        } 

        // indexが有効な値の場合
        Node node = this.head;
        while (index > 0) {
            node = node.next;
            index--;
        }
        System.out.println(length);
        return node.val;

    }
    
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = this.head;
        this.head = newHead;
        this.length++;
        System.out.println(length);
    }
    
    public void addAtTail(int val) {
        if (this.head == null) {
            this.addAtHead(val);
            return;
        } else {
            Node newTail = new Node(val);
            Node oldTail = this.head;
            while (oldTail.next != null) {
                oldTail = oldTail.next;
            }
            oldTail.next = newTail;
        }
        this.length++;
        System.out.println(length);
    }
    
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            this.addAtHead(val);
            return;
        }

        if (index == length) {
            this.addAtTail(val);
            return;
        }

        if (index > length) {
            return;
        }

        Node newIndexNode = new Node(val);
        Node prevNode = this.head;
        while (index > 1) {
            prevNode = prevNode.next;
            index--;
        }

        newIndexNode.next = prevNode.next;
        prevNode.next = newIndexNode;

        this.length++;
        System.out.println(length);
        
    }
    
    public void deleteAtIndex(int index) {
        // エッジケース
        if (index >= length) {
            return;
        }

        // head削除
        if (index == 0) {
            this.head = this.head.next;
            this.length--;
            return;
        }

        // 削除したいノードの直前のノード
        Node prevNode = this.head;
        while (index > 1) {
            prevNode = prevNode.next;
            index--;
        }

        prevNode.next = prevNode.next.next;
        this.length--;
    }
        

}
class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("1");
        myLinkedList.addAtHead(1);
        System.out.println("2");
        myLinkedList.addAtTail(3);
        System.out.println("3");
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);              // return 3
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

// @lc code=end

