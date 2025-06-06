package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
		Profesor p1 = new Profesor("Naomi", 30, "Preceptor", 5);
		Profesor p2 = new Profesor("Francisco", 40, "Docente", 10);
		Profesor p3 = new Profesor("Juan Pablo", 50, "Director", 15);
		Profesor p4 = new Profesor("Rosana", 55, "Docente", 20);
		Profesor p5 = new Profesor("Roque", 60, "Rector", 30);
		
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		listaProfesores.add(p1); //AGREGO DOS VECES A P1 PARA COMPROBAR	

		System.out.println("Listado de profesores ordenados de forma descendente por antiguedad \n");
		
		Iterator<Profesor> it = listaProfesores.iterator();
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}
		
		System.out.println("\nComparación de profesores \n");
		
		Profesor p6 = new Profesor("Daniel", 50, "Preceptor", 20);
		Profesor p7 = new Profesor("Daniel", 50, "Preceptor", 20);
		
		if(p6.equals(p7))
		{
			System.out.println("Es el mismo profesor");
		}
		else
		{
			System.out.println("No es el mismo profesor");
		}

	}

}
