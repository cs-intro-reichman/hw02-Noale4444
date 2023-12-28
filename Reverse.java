

public class Reverse {
	public static void main (String[] args){
	String s = args[0]; 
	for (int i = s.length() - 1; i >= 0; i--) { 
    System.out.print(s.charAt(i)); 
	}
	System.out.println();
    int middleIndex = (s.length()- 1) / 2; 
    char middleCharacter = s.charAt(middleIndex);
    System.out.println("The middle character is "+middleCharacter);

	}
}
