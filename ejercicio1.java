import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		if(6 < 6 * 5){
		    System.out.println("Hello");
		    System.out.println("There");
		}
		/* El programa escribe "Hello There" */
		
		int x=1, y=2, z=3;
		if(x>y){
		    if (x>z){
		        System.out.println("1111");
		    } 
		    else{
		        System.out.println("2222");
		    }
		}
		/* El programa no muestrana nada ya que el primer if no cumple con la condicion propuesta*/
		
		int x=1, y=2, z=3;
		if(x<z){
		    System.out.println("*");
		}
		else if (x==z){
		    System.out.println("&");
		}
		else{
		    System.out.println("$");
		}
		
		/* El programa retorna siempre "*" ya que los valores nunca cambian y por lo que siempre se va a cumplir la primera condicion*/
		
		int x=1, y=2, z=3;
		if(x<y){
		    System.out.println("####");
		}
		else{
		    System.out.println("&&&&");
		    System.out.println("****");
		}
		/* El programa retorna "&&&& ****(los asteriscos van abajo)" ya que la primera condicion nunca va a ser verdadero segun los valores ingresados al inicio.*/
		
		int a1=100;
		int a2=200;
		if(a1 > 100 && a2<=200){
		    System.out.println(a1+""+a2+""+(a1+a2));
		}
		else{
		    System.out.println(a1+""+a2+""+(2*a1+a2));
		}
		/* El programa siempre va a retornar "100200400" osea el else ya que la primera condicion no es verdadera*/
		
		int x=1, y=2 , z=3;
		if(++x>++y || x-- >0){
		    z++;
		}
		else{
		    z--;
		}
		System.out.println(x+""+y+""+z);
		/* El programa retorna "134" osea el if */
		
		int x=1, y=2, z=3;
		if(x<y){
		    System.out.println("####");
		    System.out.println("****");
		}
		else{
		    System.out.println("&&&&");
		}
		/* El programa retorna "#### y abajo ****" osea el primer if.*/
		
		int x=1, y=2, z=3;
		if('x' > 'y' || 66 > (int)('A')){
		    System.out.println("#*#");
		}
		/* El programa retorna "#*#" osea el primer if*/
		
		int x=1, y=2, z=3;
		if(x < z){
		    System.out.println("*");
		}
		else if(x==z){
		    System.out.println("&");
		}
		else{
		    System.out.println("$");
		}
		/* El programa retorna "*" osea el primer if ya que se cumple la condicion*/
	}
}
