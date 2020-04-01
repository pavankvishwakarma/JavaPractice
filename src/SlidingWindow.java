class Sample {
	public static void main(String[] args) {
		System.out.println(slidingWindow1(new int[] {1, 4, 2, 10, 2, 3, 1, 0, 20},4,9));
	}
	
	public static  int slidingWindow1(int arr[],int k,int len) {
		int windowSum=0;
		
		for (int i = 0; i < k; i++) {
			windowSum+=arr[i];
		}
		int max=0;
		for (int i = 0; i < len-k; i++) {
			windowSum=windowSum-arr[i]+arr[i+k];
			max=Math.max(windowSum, max);
//			System.out.println("i "+i);
//			System.out.println(" i+k "+(i+k));
		}
		return max;
	}
	
	
    public static  int slidingWindow(int arr[],int k,int len) {
    	if(k>len) {
    		System.out.println("Invalid");
    		
    	}
    	
    	int max=0;
    	for (int i = 0; i <len-k+1; i++) {
    		int sum=0;
			for (int j = i; j < (k+i); j++) {
				sum=sum+arr[j];
				max=Math.max(sum, max);
				
			}
			//System.out.println();
		}
    	return max;
    }
}
