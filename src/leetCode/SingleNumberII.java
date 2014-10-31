package leetCode;

public class SingleNumberII {

	public int singleNumber(int[] A) {
        int size = A.length;
        int[] bin = new int[32];
        int result=0;
        
        for(int i=0; i<32; i++) {
        	for(int j=0; j<size; j++) {
        		bin[i] += (A[j]>>i & 1);
        	}
        	result |= ((bin[i]%3)<<i);
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}