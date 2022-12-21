package herenciaOpenWeb;

import java.util.ArrayList;

public class TestHerencia {

	public static ArrayList<Persona> personas = new ArrayList<>();

	public static void main(String[] args) {

		Futbolista f = new Futbolista(1, "Falcao", "Garcia", 30, 9, "Tigre");
		Entrenador e = new Entrenador(2, "Pekerman", "Suarez", 60, "Argentina");
		Masajista m = new Masajista(3, "Arnulfo", "Baldor", 40, "Jefe", 20);

		personas.add(f);
		personas.add(e);
		personas.add(m);

		System.out.println("Valores recuperados ----");

		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
	}

}
