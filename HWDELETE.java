
public class HWDELETE {

	 public void sorting(char arr[])  { 
	        int n = arr.length; 
	  
	        // Build heap (rearrange array) 
	        for (int i = n / 2; i >= 0; i--) 
	            heapify(arr, n, i); 
	  
	        // One by one extract an element from heap 
	        for (int i=n-1; i>=0; i--) 
	        { 
	            // Move current root to end 
	        	exch(i, 0, arr); 
	            heapify(arr, i, 0); 
	        } 
	    } 
		public static int max(int index, char[]arr) {
			int max=index*2;
			if (index*2+1<arr.length && arr[index*2]<arr[index*2+1]) { max=index*2+1;
			}
			   return max; }
	   
	   public static void heapify(char arr[], int n, int i) 
	    { 
	        int index = i; 
	        int left = 2*i + 1;  
	        int right = 2*i + 2;  
	  
	        // Comparing left and right children 
	        if (left < n && arr[left] > arr[index]) 
	            index = left; 
	  
	        
	        if (right < n && arr[right] > arr[index]) 
	            index = right; 
	  
	        // If index is not root 
	        if (index != i) 
	        { 
	        	exch(i,index,arr);
	        	i=index ;
	     // repeating itself
	            heapify(arr, n, index);
	            }
	        } 
	    //Exchange code for sorting 
	    public static char[] exch (int a, int j, char[] arr) {
	     	char sort = arr[a];
	     	arr[a]= arr[j];
	     	arr[j]= sort;
	     	return arr;
	     }
	  
	    
	    static void printArray(char arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i]+" "); 
	        
	    } 
	  
	   
	    public static void main(String args[])  { 
	       char arr[] =  {'-','S','O','R','T','E','X','A','M','P','L','E'} ; 
	        int n = arr.length; 
	        
	
	        HWDELETE ob = new HWDELETE(); 
	        ob.sorting(arr); 
	 
	        for (int index = 0; index < arr.length - 1; index++) {
	            arr[index] = arr[index + 1];
	        }
	       
	        
	        System.out.println("Sorted array is"); 
	       printArray(arr); 
	        
	    }
	    
	} 

