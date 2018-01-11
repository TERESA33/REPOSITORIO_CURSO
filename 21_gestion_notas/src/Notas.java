import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
	
	//OJO DEL PROFESOR, está copiado NO IMPORTADO y por eso puede ser que de error
	
	static ArrayList<Double> notas=new ArrayList<>();
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int op;//opcion elegida
        do{
           System.out.println("1.- Añadir nota");
           System.out.println("2.- Media");
           System.out.println("3.- Aprobados");
           System.out.println("4.- Mostrar todas");
           System.out.println("5.- Salir");
           op=sc.nextInt();
           switch(op){
               case 1:
                   System.out.println("Nota:");
                   double d=sc.nextDouble();
                   agregarNota(d);
                   break;
               case 2:
                   System.out.println("Media:"+media());
                   break;
               case 3:
                   System.out.println("Aprobados:"+aprobados());
                   break;
               case 4:
            	   mostrarNotas();
                   break;
               case 5:
            	   break;
               default:
                   System.out.println("debes escribir una opción válida");
           }
        }while(op!=5);
    }
    private static void agregarNota( double d){
        if (d >= 0 && d <= 10) {
            notas.add(d);
        } 
    }
    private static double media(){
        double m=0;
        for(Double n:notas){
            m+=n;
        }
        return m/notas.size();
    }
    private static int aprobados(){
        int ap=0;
        for(Double n:notas){
            if(n>=5){
                ap++;
            }
        }
        return ap;
    }
    private static void mostrarNotas() {
    	for(Double n:notas){
            System.out.print(n+",");
        }
    }
}
