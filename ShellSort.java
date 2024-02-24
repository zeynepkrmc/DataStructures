//PROCEDURE SHELL_SORT(ARRAY, N)  
   //WHILE GAP < LENGTH(ARRAY) /3 :
                    //GAP = ( INTERVAL * 3 ) + 1      
   //END WHILE LOOP
   //WHILE GAP > 0 :
       //FOR (OUTER = GAP; OUTER < LENGTH(ARRAY); OUTER++):
             //INSERTION_VALUE = ARRAY[OUTER]
                    //INNER = OUTER;
             //WHILE INNER > GAP-1 AND ARRAY[INNER – GAP] >= INSERTION_VALUE:
                    //ARRAY[INNER] = ARRAY[INNER – GAP]
                    //INNER = INNER – GAP
              //END WHILE LOOP
                  //ARRAY[INNER] = INSERTION_VALUE
       //END FOR LOOP
       //GAP = (GAP -1) /3;    
   //END WHILE LOOP
//END SHELL_SORT
// Java implementation of ShellSort 
class ShellSort 
{ 
    /* An utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    /* function to sort arr using shellSort */
    int sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Start with a big gap, then reduce the gap 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            // Do a gapped insertion sort for this gap size. 
            // The first gap elements a[0..gap-1] are already 
            // in gapped order keep adding one more element 
            // until the entire array is gap sorted 
            for (int i = gap; i < n; i += 1) 
            { 
                // add a[i] to the elements that have been gap 
                // sorted save a[i] in temp and make a hole at 
                // position i 
                int temp = arr[i]; 
  
                // shift earlier gap-sorted elements up until 
                // the correct location for a[i] is found 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
                // put temp (the original a[i]) in its correct 
                // location 
                arr[j] = temp; 
            } 
        } 
        return 0; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 34, 54, 2, 3}; 
        System.out.println("Array before sorting"); 
        printArray(arr); 
  
        ShellSort ob = new ShellSort(); 
        ob.sort(arr); 
  
        System.out.println("Array after sorting"); 
        printArray(arr); 
    } 
}  