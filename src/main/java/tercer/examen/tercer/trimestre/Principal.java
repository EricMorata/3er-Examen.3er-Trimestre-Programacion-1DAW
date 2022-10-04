package tercer.examen.tercer.trimestre;

import java.util.AbstractList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import clases.Carcelero;

import clases.Preso;

/**
 * Clase principal que contiene el main No se puede hacer una documentación
 * exacta, porque su contenido depende del examen que vayas a hacer
 * 
 * @author Miguel Páramos
 *
 */
public class Principal {

	/**
	 * Función main del programa. No se puede hacer una documentación exacta, porque
	 * su contenido depende del examen que vayas a hacer
	 * 
	 * @param args No se puede hacer una documentación exacta, porque su contenido
	 *             depende del examen que vayas a hacer
	 */
	public static void main(String[] args) {

		Queue<Preso> presos = new LinkedList<Preso>();
		presos.add(new Preso("32594323C", "JAVIER", "SANCHEZ PEREZ", "CHILLAMAÑANAS", (byte) 2));
		presos.add(new Preso("73941849F", "CARLOS", "DURAN ARIAS", "CHUPACABRA", (byte) 6));
		presos.add(new Preso("58493019Y", "JESUS", "CARMONA MORA", "SOPLAGAITAS", (byte) 1));
		presos.add(new Preso("91284738Q", "ALEJANDRO", "ROJAS SOTO", "CARNE DE PESCUEZO", (byte) 9));
		presos.add(new Preso("62913944T", "AITOR", "CASTILLO CORTES", "EL JIERRO", (byte) 4));
		presos.add(new Preso("18549232H", "HECTOR", "MARIN CANO", "EL BASURILLA", (byte) 4));
		
		TreeSet<Preso> ordenaPreso = new TreeSet<Preso>();
		 
		Preso pr1 = new Preso ("32594323C", "JAVIER", "SANCHEZ PEREZ", "CHILLAMAÑANAS", (byte) 2);
		Preso pr2 = new Preso ("73941849F", "CARLOS", "DURAN ARIAS", "CHUPACABRA", (byte) 6);
		Preso pr3 = new Preso ("58493019Y", "JESUS", "CARMONA MORA", "SOPLAGAITAS", (byte) 1);
		Preso pr4 = new Preso ("62913944T", "AITOR", "CASTILLO CORTES", "EL JIERRO", (byte) 4);
		Preso pr5 = new Preso ("91284738Q", "ALEJANDRO", "ROJAS SOTO", "CARNE DE PESCUEZO", (byte) 9);
		Preso pr6 = new Preso ("18549232H", "HECTOR", "MARIN CANO", "EL BASURILLA", (byte) 4);
		
		 ordenaPreso.add(pr1);
		 ordenaPreso.add(pr2); 
		 ordenaPreso.add(pr3);
		 ordenaPreso.add(pr4);
		
		for(Preso pr :ordenaPreso) {
			System.out.println(pr.getDni());
		 
		 }
		 
		
		
		
		Stack<Carcelero> carceleros = new Stack<Carcelero>();
		carceleros.add(new Carcelero("55402143J", "FERNANDO", "RAMIREZ GIL"));
		carceleros.add(new Carcelero("92934959R", "JORGE", "MORALES SERRANO"));
		carceleros.add(new Carcelero("40105043P", "ADRIAN", "BLANCO CASTRO"));
		carceleros.add(new Carcelero("27401233N", "ALBERTO", "ORTEGA SUAREZ"));

		Iterator<Carcelero> it = carceleros.iterator();
		for (Carcelero carcelero : carceleros) {
			System.out.println(carcelero);
		}

		LinkedHashSet<Carcelero> carceleroLHS = new LinkedHashSet<Carcelero>();

		carceleroLHS.add(new Carcelero("26813688N", "Eric", "Morata"));
		carceleroLHS.add(new Carcelero("88998877E", "Jose", "Mota"));
		carceleroLHS.add(new Carcelero("12345678R", "Miguel", "Perez"));
		carceleroLHS.add(new Carcelero("98564564Z", "Antonio", "Ledesma"));

		Iterator<Carcelero> itlhs = carceleroLHS.iterator();
		while (itlhs.hasNext()) {

			String dni = itlhs.next().getDni();
			System.out.println(dni);

		}
		for (Carcelero carcelero : carceleroLHS) {
			System.out.println(carcelero);
		}
	}

}
