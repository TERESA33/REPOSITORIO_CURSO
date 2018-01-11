import java.util.ArrayList;
import java.util.Scanner;

public class MenuGestionNotas2 {
	
	//OJO mio ESTÁ SIN PROBAR Y NO SE SI FUNCIONA, CREO QUE NO

	public static void main(String[] args) {
		
		ArrayList<Integer> notas=new ArrayList<>();		
		
		System.out.println("Seleccione una opción:");
		System.out.println("   1.- Añadir Nota");
		System.out.println("   2.- Ver Aprobados");		
		System.out.println("   3.- Nota Media");
		System.out.println("   4.- Mostrar todas");
		System.out.println("   5.- Salir");	
				
        //capturar la opción elegida
		Scanner sc=new Scanner(System.in); 
		int opcion=sc.nextInt();
				

		do {		       		
			switch (opcion){ 
				case 1:
					anadirNota(notas);
					break;						
				case 2:					
					verAprobados(notas);
					break;			
				case 3: 
					notaMedia(notas);
					break;			
				case 4:					
					mostrarTodas(notas);
					break;			
				case 5: 
					System.out.println("Fin de programa");
					break;			 
				default: 
					System.out.println("Opción no disponible"); 
			}
		}while(opcion!=5);
	}
	
	private static void anadirNota(ArrayList<Integer> notas) {		
		Scanner sc=new Scanner(System.in); 
		Integer valor=sc.nextInt();
		notas.add(valor);
	}	
		
	private static void verAprobados(ArrayList<Integer> notas) {
		if(notas.size()==0) {
			System.out.println("No hay ninguna nota para poder mostrar");
		}else {		
				for(Integer n:notas) {
					if(n>=5) {
						System.out.println(n);
					}
				}
		}
	}	
		
	private static void notaMedia(ArrayList<Integer> notas) {
		double media=0;
		if(notas.size()==0) {
			System.out.println("No hay ninguna nota para poder realiza la media");
		}else {
			for(Integer n:notas) {
				media+=n;
			} 			
			System.out.println("La media es "+ media/notas.size());
		}
		
	}
		
	private static void mostrarTodas(ArrayList<Integer> notas) {
		if(notas.size()==0) {
			System.out.println("No hay ninguna nota que mostrar");
		}else {
			for(int n:notas) {
				System.out.println(n);
			}			
		}
	}	


}
