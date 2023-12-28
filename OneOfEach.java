

public class OneOfEach {
	public static void main (String[] args) {
	
	int sum = 0;
	boolean hasBoy = false;
	boolean hasGirl = false; 

	while( !hasBoy || !hasGirl ) {
    boolean isBoy = Math.random() < 0.5;

    if (isBoy) { 
    System.out.print("b ");
    hasBoy = true;
    sum = sum + 1;

  } else { 
    System.out.print("g ");
    hasGirl = true; 
    sum = sum + 1;
  } }
    System.out.println();
    System.out.println("you made it... and you now have "+sum+" children.");


        }
         
    }
     
	


