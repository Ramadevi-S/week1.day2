package week1.day2.assignments;

public class FindIntersectionArray {

	public static void main(String[] args){
		int myArr1[] = {3,2,11,4,6,7};
		int myArr2[] = {1,2,8,4,9,7};
		int m = myArr1.length;
		int n = myArr2.length;
		
		
		  //System.out.println(" Intersection of two arrays : "); 
		  for(int i=0; i < m; i++ ) {
		   for(int j=0; j < n; j++ ) {
			  if(myArr1[i] == myArr2[j]) { 
				  System.out.println ("The result is " + (myArr1[i]) );
				  }
			  
			  } 
		  }
		 
	}

}
