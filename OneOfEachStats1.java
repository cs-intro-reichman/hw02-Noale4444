
public class OneOfEachStats1 {
	public static void main (String[] args) {
	
	int T = Integer.parseInt(args[0]); 
	int totalChildren = 0;
	int familyWith2Children = 0;
	int familyWith3Children = 0;
	int familywith4OrMoreChildren = 0;
    int commonNumberOfChildren = 0;

    for(int i = 0; i < T; i++) {
    
    boolean hasBoy = false;
    boolean hasGirl = false; 
    int sum = 0;

    while( !hasBoy || !hasGirl ) {
    boolean isBoy = Math.random() < 0.5;

    if(isBoy) {
    hasBoy = true;
    	
  } else {
    hasGirl = true; 
  } 
   sum++;
}
  totalChildren = totalChildren + sum; 

    if(sum == 2) {
    familyWith2Children++;	
   }else if(sum == 3) {
   	 familyWith3Children++;
   }else if( sum >= 4) {
   	 familywith4OrMoreChildren++;
       }
     } 
    int max = Math.max(Math.max(familyWith2Children, familyWith3Children), familywith4OrMoreChildren); 
    if(max == familyWith2Children){
    commonNumberOfChildren = 2;	
  } else if(max == familyWith3Children) { 
    commonNumberOfChildren = 3;
  } else if(max == familywith4OrMoreChildren) {
  	commonNumberOfChildren = 0;
  }


    double averageChildren = (double) totalChildren / T;

    
    System.out.println("Average: "+averageChildren+" children to get at least one of each gender.");
    System.out.println("Number of families with 2 children: "+familyWith2Children);
    System.out.println("Number of families with 3 children: "+familyWith3Children);
    System.out.println("Number of families with 4 or more children: "+familywith4OrMoreChildren);
    System.out.println("The most common number of children is "+((commonNumberOfChildren == 0) ? "4 or more" : commonNumberOfChildren)+" .");


            }

         }
     



	


       
