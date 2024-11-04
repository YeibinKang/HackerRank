// You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. If all data attributes are equal and the lists are the same length, return . Otherwise, return .

static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedListNode current1 = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current2 = new SinglyLinkedListNode(0);
        
        current1 = head1;
        current2 = head2;
        
        //make a flag
        boolean sameNodes = false;
        
        // if both are null, return 1
     
            
        if(head1 == null && head2 == null){
            sameNodes = true;
            return sameNodes;
        }else{
            while(current1 != null){
            
            while(current2 != null){
                if(current1.data == current2.data){
                    if(current1.next != null && current2.next != null){
                        current1 = current1.next;
                        current2 = current2.next;
                        sameNodes = true;
                    }else{
                        // next is null
                        return sameNodes;
                    }
                    
                }else{

                    sameNodes = false;
                    return sameNodes;
                }
            }
          
            
        }
        }
        
        return sameNodes;
        
        
        
        

    }