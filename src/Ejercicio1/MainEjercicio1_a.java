package Ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		Profesor p1 = new Profesor("Analia", 65, "Directivo", 7);
		Profesor p2 = new Profesor("Roberto", 42, "Vicedirectivo", 11);
		Profesor p3 = new Profesor("Juan", 27, "Tutor", 1);
		Profesor p4 = new Profesor("Maria", 55, "Maestra", 20);
		Profesor p5 = new Profesor("Raul", 35, "Conserje", 14);
		
		ArrayList<Profesor> profesores = new ArrayList<>(5);
		profesores.add(p1);
		profesores.add(p2);
		profesores.add(p3);
		profesores.add(p4);
		profesores.add(p5);
		
		Iterator<Profesor> iterador = profesores.iterator();
		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
	}

}
