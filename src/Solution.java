import java.util.*;
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	boolean bandera=true;
    	int N=0;
    	while(bandera) {
    	System.out.println("Dame un número del 1 al 100");
        N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); //Evita que haya problemas al leer el dato, es decir ignora saltos de linea o otras cosas raras, mediante esta expresion regular
        if(N>0 && N<101) {
        	bandera=false;
        }
    	}//while
    	
    	if(!(N%2==0)) {
    		System.out.println("Weird");
    	} else {
    		if(N>=2 && N<=5) {
    			System.out.println("Not Weird");
    		}
    		else if (N>=6 && N<=20) {
    			System.out.println("Weird");
    		}
    		else{
    			System.out.println("Not Weird");
    		}
    	}//else
        scanner.close();
    }//main 
}//class Solution
