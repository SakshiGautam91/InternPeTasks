public class UniqueDuplicate {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 7, 8, 9, 8, 11, 3, 15, 2};   
          
        System.out.println("Task 4 :- Non Unique Duplicate element in given array: ");
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }
    }
    
}