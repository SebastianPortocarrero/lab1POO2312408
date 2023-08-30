import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int num1,num2;
	    
		System.out.println("Ingrese num A:");
		num1 = s.nextInt();
		
		System.out.println("Ingrese num B:");
		num2 = s.nextInt();
		
		if(num1 > 0 && num2 >0){
		    System.out.println("True");
		}
		else{
		    System.out.println("False");
		}
	}
}
