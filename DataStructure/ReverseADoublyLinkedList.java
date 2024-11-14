// Given the pointer to the head node of a doubly linked list, reverse the order of the nodes in place. That is, change the next and prev pointers of the nodes so that the direction of the list is reversed. Return a reference to the head node of the reversed list.

public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
    
        DoublyLinkedListNode currentNode = llist;
        DoublyLinkedListNode prevNode = null;
        
        //check if head is null
            //return it
        if(llist == null ||llist.next == null){
            return llist;
        }else{
            
           
                //swap next and prev pointers 
            while(currentNode != null){
                
                //first 
                prevNode = currentNode.prev;
                
                currentNode.prev = currentNode.next;
                currentNode.next = prevNode;
                
                currentNode = currentNode.prev;
          
                
            }
            llist = prevNode.prev;
            
            
            
            return llist;
        }

    }