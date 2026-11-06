package Dam1_Guanlin1;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);


	System.out.println("nombre");
	String nombre=input.nextLine();
	
	System.out.println("sueldo base");
	double sueldobase=input.nextDouble();
	while(sueldobase<=0) {
    	System.out.println("introduce de nuevo el sueldo base");
    	sueldobase=input.nextDouble();
    	}
    
	
	System.out.println("¿vives lejos?");
	System.out.println("1.Sí");
    System.out.println("2.No");
    int transporte=input.nextInt();
    boolean opcion=false;
    
    if(transporte==1) {
    	opcion=true;
    }
    System.out.println("¿Cuántos años llevas trabajando en la empresa?");
    int anios=input.nextInt();
    
    int antiguo =(anios/3)*(2/100);  //al ser un entero me devuelve los resusltado en enteros.
    
    double sueldoantiguo=sueldobase*antiguo;   // el dinero que genero por cada 3 años de experiencia;
    
    if(opcion==true) {
    	sueldobase+=100;
    }
    
    double sueldobruto=sueldobase+sueldoantiguo;
    
   double irpf=0;

    if(sueldobruto>2000) {
    	irpf=sueldobruto*(20/100);
    }else if(sueldobruto<=2000 && sueldobruto>=1000) {
    	irpf=sueldobruto*(15/100);
    }else if(sueldobruto<1000) {
    	irpf=sueldobruto*(10/100);
    }
  
   double sueldoneto=sueldobruto-irpf;
	
    System.out.println("nombre"+nombre);
    System.out.println("sueldo base"+sueldobase);
    
    if(opcion==true) {
    	  System.out.println("complemento transporte"+" 100");
    }else {
    	  System.out.println("complemento transporte"+" 0");
    }
    System.out.println("complemento antiguedad"+antiguo);
    System.out.println("sueldo neto "+sueldoneto);
	}

}
