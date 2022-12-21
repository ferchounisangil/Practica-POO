package herenciaOpenWeb;

public class Persona {
	
	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	
	public Persona(int id, String nombre, String apellido, int edad) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Persona (String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	public void concentrarse() {
		System.out.println("Concentrado mijo");
	}
	
	public void viajar () {
		System.out.println("Vamos a viajar");
	}
	
	
	
	

}
