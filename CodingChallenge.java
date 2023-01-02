import java.util.*;     // IMPORTING JAVA PACKAGES

class CodingChallenge {   //DECLARING THE CLASS CODINGCHALLENGE

public static void main (String [] args) {   //DECLARING THE MAIN METHOD

int [] num = {2,6,6,2,8,0,7,6,1,4,6,3,6};  //INTIALISING THE ARRAY

 for(int i=0; i<num.length; i++) {   // GO THROUGH THE ARRAY TO FIND THE MOST FREQUENT ARRAY
	
	 }
 Arrays.sort(num);  //SORT THE ARRAY IN ASCENDING ORDER
 
    int n=num.length; // INITIALISE AND DECLARE N AS THE LENGTH OF THE ARRAY
    
    int countofmax = 1;
    int temp = num[0]; 
    int count = 1; 
    
    for (int i = 1; i < num.length; i++) 
    { 
      if (num[i] == num[i - 1]) 
        count++; 
      else
      { 
        if (count > countofmax) 
        { 
          countofmax = count; 
          temp = num[i - 1]; 
        } 
        count = 1; 
      } 
    } 
  
   
    if (count > countofmax) 
    { 
      countofmax = count; 
      temp = num[n - 1]; 
    } 
	
int j;
for( j = 0; j<num.length; j++) {
	
	 }
Arrays.sort(num); 
	//DECLARE CURRENT ELEMENT COUNT, MIN ELEMET COUNT AND LEAST FREQUENT
	int current_element_count = 1;
		int min_element_count = num.length+1;
		int least_frequent_element = num[0];
		
		
		// gO THROUGH THE ARRAY TO SEARCH FOR THE LEAST FREQUENT ARRAY
		if(num[j-1] == num[j-2])
			{
				current_element_count++;
			}
				else {
				if(current_element_count < min_element_count)
				{
					min_element_count = current_element_count;
					least_frequent_element = num[j-1];
				}
				current_element_count = 1;
			}
			
			if(current_element_count < min_element_count)
		{
			min_element_count = current_element_count;
			least_frequent_element = num[num.length-1];
		}		
	
	
	
	
  System.out.println("The most frequent element is:"+temp); // DISPLAY THE MOST FREQUENT ELEMENT
  System.out.println("Least frequent element: " + least_frequent_element);	//DISPLAY LEAST FREQUENT ELEMENT
  } 
} 	 
	 	 