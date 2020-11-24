package py.edu.uc.lp3.domain;

public class Alumno extends Persona {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6121652977840965395L;
	/*
	 * Especializamos la clase Persona, agregando un atributo exclusivo de esta
	 * clase por ser una clase hija de Persona, Alumno obtiene todas las propiedades
	 * y comportamientos de la clase Persona
	 */
	private int numeroMatricula;

	public Alumno(String nombre, String apellido, int edad) {
		/*
		 * invocamos al constructor de la super clase (clase padre), en este caso se
		 * invoca al constructor de la clase persona
		 */
		super(nombre, apellido, edad);
	}

	public Alumno() {
		/*
		 * invocamos al constructor de la super clase (clase padre), en este caso se
		 * invoca al constructor de la clase persona
		 */
		super(-1, "sin nombre");
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
}
