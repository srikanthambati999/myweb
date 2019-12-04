package in.javahome.myweb.controller;
/*
 * 
 */
public class Calculator {
	
	String ptr = null; 
  
        // Checking if ptr.equals null or works fine. 
        try
        { 
            // This line of code throws NullPointerException 
            // because ptr is null 
            if (ptr.equals("gfg")) 
                System.out.print("Same"); 
            else 
                System.out.print("Not Same"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException Caught"); 
        } 
	
	/*
	 * @param i
	 * @param j
	 * @return int
	 */
	public int add(int i, int j){
		
		return i+j;
		
	}
	public int multiply(int i, int j){
		return i*j;
	}
	
	public int sub(int i, int j){
		return i-j;
	}
}
