    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        
        //using Java hashMap
        
        //Create a hashmap 
        
        int temp = 0;
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<n; i++){
            //if the key of hash_map has ar.get(i) -> increase value
            if(hash_map.containsKey(ar.get(i))){
                hash_map.replace(ar.get(i), hash_map.get(ar.get(i))+1);
            }else{  //else put a new key/value in hash_map
                hash_map.put(ar.get(i),1);
            }
            
            
            
        }
         
         //looping and calculate how many pairs are in the hashMap
         int pairs = 0;
         int total = 0;
         for (Integer value : hash_map.values()) {
            pairs = value/2;
            total += pairs;
        }   
        
        return total;
    }

}