package Ejercicio1;

public class Empleado {
	//atributos
		private final int id;
		private static int proximoID = 1000;
		private String nombre;
		private int edad;

		//constructores
		public Empleado() {
			id = proximoID++;
			nombre = "sin nombre";
			edad = 99;
		}

		public Empleado(String nombre, int edad) {
			this.id = proximoID++;
			this.nombre = nombre;
			this.edad = edad;
		}
		public static int DevuelveProximoID(){
			return proximoID+1;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Empleado id=" + id  +
					", nombre=" + 
					nombre + 
					", edad=" +
					edad;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + edad;
			result = prime * result + id;
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Empleado other = (Empleado) obj;
			if (edad != other.edad)
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}

			
	

}
