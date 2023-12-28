
public class DamkaBoard {
	public static void main(String[] args) {
	
	int n = Integer.parseInt(args[0]); 

	for(int i = 0; i < n;i++) {
    for(int j = 0; j < n;j++) { 
    System.out.print(( i % 2 == 0 ? "" : " ")+"* ");

      }
    System.out.println();
       
      }

	}
}
