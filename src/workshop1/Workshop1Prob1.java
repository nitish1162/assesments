package workshop1;

public class Workshop1Prob1 {
	
	//function that finds the sum of digits of a number  
    static int findSum(int result)  
    {     
    //variable that stores the sum      
    int sum = 0;
    //executes until the condition becomes false  
    while (result != 0)  
    {  
    //finds the last digit from the number and add it to the variable sum      
    sum = sum + result % 10;  
    //removes the last digit  
    result = result/10;  
    }  
    //returns the sum  
    return sum;  
    }
	
	public static void main(String[] args) 
    {
        int temp;
        int x = 67;
        int y = 89;
        int result = 0;
         
        //Swapping in steps
        temp = x;
        x = y;
        y = temp;
         
        //Verify swapped values
        System.out.println("x = " + x + " and y = " + y);
        
        System.out.println("Combining two numbers: "+concat(x, y));
        
        System.out.println("The sum of digits: "+findSum(result));
    }
	
	// Function to concatenate
    // two integers into one
    static int concat(int x, int y)
    {
    	
 
        // Convert both the integers to string
        String s1 = Integer.toString(x);
        String s2 = Integer.toString(y);
 
        // Concatenate both strings
        String s = s1 + s2;
 
        // Convert the concatenated string
        // to integer
        int result = Integer.parseInt(s);
 
        // return the formed integer
        return result;
    }
    
    

}
