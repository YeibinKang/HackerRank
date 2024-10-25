//Given a reference to the head of a doubly-linked list and an integer
//create a new DoublyLinkedListNode object having data value  and insert it at the proper location to maintain the sort.

//1. create a current, previous, newNode pointer
//2. if llist is empty, return newNode
//3. if current data is greater than data, 
    //put the newNode at the first position
//4. rotate pointers through llist
    // until current.data > data and current is not null
//5. if current is null, 
    // put the newNode at the end position
//6. disconnect and connect pointers to insert the newNode into the list

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
        
        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode previous = null;
        
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if(llist == null){
            return newNode;
        }
        
        //put it in the first position
        if(data < current.data){
            current.prev = newNode;
            newNode.next = current;
            newNode.prev = null;
            return newNode;
        }
        
        // move to the next position
        while(current != null && current.data < data){
        
                previous = current;
                current = current.next;
         
        }
        
        //put it at the end
        if(current == null){
            previous.next = newNode;
            newNode.prev = previous;
            newNode.next = null;
            return llist;
        }
                //insert
                newNode.next = previous.next;
                previous.next = newNode;
                newNode.prev = previous;
                newNode.next.prev = newNode;
                
                
                return llist;

    
    }