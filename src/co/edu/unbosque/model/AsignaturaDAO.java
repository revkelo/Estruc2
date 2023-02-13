package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.view.Consola;

public class AsignaturaDAO {

	private ArrayList<AsignaturaDTO> asignatura1;
	private ArrayList<AsignaturaDTO> asignatura2;
	private ArrayList<AsignaturaDTO> asignatura3;
	private Consola miconsola;

	public AsignaturaDAO() {
		asignatura1 = new ArrayList<AsignaturaDTO>();
		asignatura2 = new ArrayList<AsignaturaDTO>();
		asignatura3 = new ArrayList<AsignaturaDTO>();
		miconsola = new Consola();
	}

	public void guardar_materia1(String nombre_asignatura, String estudiante, double random1) {

		AsignaturaDTO a = new AsignaturaDTO(nombre_asignatura, estudiante, random1);
		asignatura1.add(a);

	}

	public void guardar_materia2(String nombre_asignatura, String estudiante, double nota_materia) {

		AsignaturaDTO a = new AsignaturaDTO(nombre_asignatura, estudiante, nota_materia);
		asignatura2.add(a);

	}

	public void guardar_materia3(String nombre_asignatura, String estudiante, double nota_materia) {

		AsignaturaDTO a = new AsignaturaDTO(nombre_asignatura, estudiante, nota_materia);
		asignatura3.add(a);

	}

	public boolean eliminar(int pos) {
		try {
			asignatura1.remove(pos);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public void mostrar_materia1() {

		for (int i = 0; i < asignatura1.size(); i++) {
			miconsola.imprimirString("\n");
			miconsola.imprimirString(asignatura1.get(i).getNombre_asignatura());
			miconsola.imprimirString(asignatura1.get(i).getEstudiante());
			miconsola.imprimirString("Nota materia del estudiante " + asignatura1.get(i).getNota_materia());
			miconsola.imprimirString("\n");
		}
	}

	public void mostrar_materia2() {

		for (int i = 0; i < asignatura2.size(); i++) {
			miconsola.imprimirString("\n");
			miconsola.imprimirString(asignatura2.get(i).getNombre_asignatura());
			miconsola.imprimirString(asignatura2.get(i).getEstudiante());
			miconsola.imprimirString("Nota materia del estudiante " + asignatura2.get(i).getNota_materia());
			miconsola.imprimirString("\n");
		}
	}

	public void mostrar_materia3() {

		for (int i = 0; i < asignatura2.size(); i++) {
			miconsola.imprimirString("\n");
			miconsola.imprimirString(asignatura3.get(i).getNombre_asignatura());
			miconsola.imprimirString(asignatura3.get(i).getEstudiante());
			miconsola.imprimirString("Nota materia del estudiante " + asignatura3.get(i).getNota_materia());
			miconsola.imprimirString("\n");
		}
	}

	public ArrayList<AsignaturaDTO> getAsignatura1() {
		return asignatura1;
	}

	public void setAsignatura1(ArrayList<AsignaturaDTO> asignatura1) {
		this.asignatura1 = asignatura1;
	}

	public ArrayList<AsignaturaDTO> getAsignatura2() {
		return asignatura2;
	}

	public void setAsignatura2(ArrayList<AsignaturaDTO> asignatura2) {
		this.asignatura2 = asignatura2;
	}

	public ArrayList<AsignaturaDTO> getAsignatura3() {
		return asignatura3;
	}

	public void setAsignatura3(ArrayList<AsignaturaDTO> asignatura3) {
		this.asignatura3 = asignatura3;
	}

	public Consola getMiconsola() {
		return miconsola;
	}

	public void setMiconsola(Consola miconsola) {
		this.miconsola = miconsola;
	}

//	public boolean actualizarNombre(int pos, double nota_nuevo) {
//		try {
//			asignatura1.get(pos).setNombre(nom_nuevo);
//			;
//			return true;
//
//		} catch (Exception e) {
//			return false;
//		}
//	}

}
