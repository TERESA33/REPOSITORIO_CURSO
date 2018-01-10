package principal;

public class Notas {

	public static void main(String[] args) {
		
		//FUNCIONA OK
		
		//APP q nos diga el numero de aprobados y nota media
		
		/*
		 * //las notas se proporciona como argumentos de LINEA DE COMANDOS
		 * String data="9.0,4.6,8.5,3.7,2.4,6.7,1.5,7.8";  
		 * // y ya no es necesario separar lo valores porque nos llegan en el Array de Argumentos de MAIN 
		 * String [] notas=data.split("[,]");
		*/
		
		//no hace falta transformar este array de cadenas en arrays de doubles
			
				/*  NO FUNCIONA ¿ ver pq no me funciono
				int contador=0;
				for(int i=0;i<notas.length;i++) {
					if(notas[i].equals("5.0") || notas[i].equals("5.0")) {
						contador++;
					}
				}
				System.out.println("Aprobados "+contador); //sale 0
				*/
		
		System.out.println("Aprobados "+aprobados(args));
		System.out.println("Aprobados "+media(args));		
		/*
		 * SALIDA cuando NO pasamos argumentos
		 Aprobados 0
		 Aprobados NaN
		--
		SALIDA cuando SI pasamos argumentos
		Aprobados 3
        Aprobados 7.533333333333334
		 */
		/*
		 * OTRO CAMBIO
		 */

	}
	
	
	private static int aprobados(String[] valores) {
		int ap=0;

		for(String n:valores) {
			if(Double.parseDouble(n)>=5) {
				ap++;
			}
		}	
		return ap;
	}
	
	private static double media(String[] valores) {
		double media=0;
		for(String n:valores) {
			media+=Double.parseDouble(n);
		}
		return media/valores.length;
		
	}

	
	
}
