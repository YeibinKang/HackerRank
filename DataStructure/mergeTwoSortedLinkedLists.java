static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        //Given pointers to the heads of two sorted linked lists, merge them into a single, sorted linked list. Either head pointer may be null meaning that the corresponding list is empty.

        //1. Create a SinglyLinkedListNode, temp
        //2. Create a tail node to point temp
        //3. Loop while both head1 and head2 are not null
            // - if head1's data is less than head2
                // - tail's next should point to head1
            // - if head2's data is less than head1
                // - tail's next should point to head2
        //4. Check if head1 or head2 is null
            // since they are sorted lists, tail should point the rest of nodes.
        //5. Return temp's next

        SinglyLinkedListNode temp = new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail = temp;
        
        
        
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }else{
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        
        if(head1 == null){
            tail.next = head2;
        }else if(head2 == null){
            tail.next = head1;
        }
        
        
        return temp.next;
        
        
        
    }