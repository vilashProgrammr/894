import java.lang.*; 
import java.io.*; 
import java.util.*; 

class StringReverse{

	public static void main(String a[]) throws Exception
	{
        String st;      //contains user input statement 
        String reverse = ""; //will contain reverse characters of the given string
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Statement:"); 
         st=br.readLine();
        System.out.println("The reverse is:");

        /*  Uncomment this solution code 
        for(int i = st. length() - 1; i >= 0; i--) {
        reverse = reverse + st.charAt(i);
        } 
        */

        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(st); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 


        System.out.println(input1);
 	 
        }  
   
}
