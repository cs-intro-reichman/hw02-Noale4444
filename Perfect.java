
public class Perfect {
	public static void main (String[] args) {
	
	int N = Integer.parseInt(args[0]);
	int sum = 1;
	String s = N+" is a perfect number since "+N+" = 1";	
    
    for(int i = 2; i < N; i++) { 
    if(N % i == 0) {
    s = s+" + "+i;
    sum = sum + i; 
      } }
    if(sum == N) {
    	System.out.println(s);
    } else 
    System.out.println(N+" is not perfect number ");

     

	 }

   }
 