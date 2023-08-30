import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int num;
	    
	    System.out.println("Ingrese un numero");
	    num = s.nextInt();
	    
	    if(num > 0 && num % 2 !=0){
	        System.out.println("True");
	    }
	    else{
	        System.out.println("False");
	    }
	}
}
