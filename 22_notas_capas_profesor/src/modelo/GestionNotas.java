package modelo;

import java.util.ArrayList;

public class GestionNotas {
	//almac�n de notas
	ArrayList<Double> notas=new ArrayList<>();
	//m�todos de negocio
	public void agregarNota(double d) {
		notas.add(d);
	}
	public int aprobados() {
		int ap=0;
        for(Double n:notas){
            if(n>=5){
                ap++;
            }
        }
        return ap;
	}
	public double media() {
		double m=0;
        for(Double n:notas){
            m+=n;
        }
        return m/notas.size();
	}
	public Double[] devolverNota() {
		return notas.toArray(new Double[0]);
	}
	
	
}
