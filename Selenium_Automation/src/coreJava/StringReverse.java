package coreJava;

public class StringReverse {

	
		
	public static void main(String[] args) {
	    //create a variable to store string		
		String str = "Welcome to Texas";
		
		//create a var to store reversed string
        String reversed = reverseString(str);
        //add a print output statement by including reverse string var
        System.out.println("The reversed string is: " + reversed);
    }

	public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
	 
	    

	


