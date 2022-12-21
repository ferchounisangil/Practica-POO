package herenciaOpenWeb;

public class Entrenador extends Persona {

	private String federacion;

	public Entrenador(int id, String nombre, String apellido, int edad, String federacion) {
		super(id, nombre, apellido, edad);
		this.federacion = federacion;
	}

	public String getFederacion() {
		return federacion;
	}

	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}

	public void dirigirPartido() {
		System.out.println("Dirigiendo un partido");
	}

	public void dirigirEntrenamiento() {

		System.out.println("Dirigiendo un entrenamiento");
	}

	@Override
	public String toString() {
		return super.toString() + ", [federacion=" + federacion + "]";
	}
	
	

}
