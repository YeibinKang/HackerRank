//You are given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. Delete nodes and return a sorted list with each distinct value in the original list. The given head pointer may be null indicating that the list is empty.

public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
    
        //1. create prevNode, currNode
        //2. check if llist is null
            //if null, return
            // else, current = current.next
        //3. while loop, until currNode is not null
            //if prev.data == current.data
                //delete current
                    //prev.next = current.next, current = current.next
            //if not, keep
                //prev = current, current = current.next
        //4. return current
        
        SinglyLinkedListNode currentNode = llist;
        SinglyLinkedListNode prevNode = llist;
        
        if(currentNode == null){
            return currentNode;
        }else{
            currentNode = currentNode.next;
        }
        
        while(currentNode != null){
            if (prevNode.data == currentNode.data){
                prevNode.next = currentNode.next;
                currentNode = currentNode.next;
            }else{
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        
        return llist;

        
        
    }