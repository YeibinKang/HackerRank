//

public static List<Integer> getMax(List<String> operations) {
    // Write your code here
    
        // create 2 stacks to save a current stack and max stack.
        // seperate numbers from a string (operation and value)
        // based on operation, 
            //1: insert a value to stacks
                //check maxStack is empty or not (giving me an error)
                //check max value based on the new value
            //2: delete a value from stacks
            //3. find the largest number in maxStack (at the first stack)
    
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> tempMax = new ArrayList<>();
        
        //seperate number (operation) from a string
        for(String operation : operations){
            Integer op = Integer.parseInt(operation.split(" ")[0]);
            
            
            switch(op){
                case 1:
                    Integer temp = Integer.parseInt(operation.split(" ")[1]);
                    mainStack.push(temp);
                    
                    Integer max = Integer.MIN_VALUE;
                    
                    if(!maxStack.isEmpty()){
                        max = maxStack.peek();
                    }
                    
                    if(temp > max){
                        //change
                        maxStack.push(temp);
                    }else{
                        maxStack.push(max);
                    }
                    break;
                case 2:
                    mainStack.pop();
                    maxStack.pop();
                    break;
                case 3:
                    
                    tempMax.add(maxStack.peek());
                    break;
                    
            }
        }
        
        System.out.println(tempMax);

        return tempMax;
    }

