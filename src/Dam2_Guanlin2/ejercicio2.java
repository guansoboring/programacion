package Dam2_Guanlin2;
import java.util.Scanner;
public class ejercicio2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
System.out.println("introduce un número");
int n=input.nextInt();
System.out.println("introduce otro número");
int m=input.nextInt();

if(n>m) { 

	while(m<n) {
		m++;
	if(m%7==0 && m%13==0) {
		while(m<=n) {
		System.out.println(m);
			}}
	
	}
	
	}
		      
	}

	
}





