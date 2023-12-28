
public class InOrder {
	public static void main (String[] args) {
	
	int x = (int)(Math.random() * 10);
	System.out.print(x);

	int y = (int)(Math.random() * 10);
	while( y >= x ) { 
    System.out.print(" "+y);
    x = y;
    y = (int)(Math.random() * 10);

	  }

	}
  }
