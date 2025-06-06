package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;



public class mainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo ArrayList
		ArrayList<Edificio> instalaciones = new ArrayList<>();
		
		
		// Crear 3 polideportivos y los agrego al ArrayList
       Polideportivo poli1 = new Polideportivo(1500.75, "Polideportivo de Zona Norte");
       Polideportivo poli2 = new Polideportivo(2725.16, "Polideportivo de Zona Centro");
       Polideportivo poli3 = new Polideportivo(1653.32, "Polideportivo de Zona Sur");
       
       instalaciones.add(poli1);
       instalaciones.add(poli2);
       instalaciones.add(poli3);
       
       //Creo 2 edificios de oficinas y los agrego al ArrayList
       EdificioOficinas edifOfi1 = new EdificioOficinas(1002.36, 67);
       EdificioOficinas edifOfi2 = new EdificioOficinas(1069.95, 74);
       
       instalaciones.add(edifOfi1);
       instalaciones.add(edifOfi2);
       
            
       
       //Muestro en un iterador
		Iterator<Edificio> iterador = instalaciones.iterator();
		while(iterador.hasNext()) {
			
			System.out.println(iterador.next());
		}

	}

}
