package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.view.Consola;

public class EstudianteDAO {
	private Consola miconsola;

	private ArrayList<EstudianteDTO> lista;

	private ArrayList<EstudianteDTO> respaldo;

	public EstudianteDAO() {
		lista = new ArrayList<EstudianteDTO>();
		respaldo = new ArrayList<EstudianteDTO>();
		miconsola = new Consola();
	}

	public void guardar(String nombre, double nota_materia1, double nota_materia2, double nota_materia3,
			double promedio) {

		EstudianteDTO a = new EstudianteDTO(nombre, nota_materia1, nota_materia2, nota_materia3, promedio);
		lista.add(a);
		respaldo.add(a);

	}

	public boolean eliminar(int pos) {
		try {
			lista.remove(pos);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean actualizarNombre(int pos, String nom_nuevo) {
		try {
			lista.get(pos).setNombre(nom_nuevo);
			;
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public void mostrar() {

		for (int i = 0; i < lista.size(); i++) {
			miconsola.imprimirString("\n");
			miconsola.imprimirString("Nombre " + lista.get(i).getNombre());
			miconsola.imprimirString("Nota materia 1 " + lista.get(i).getNota_materia1());
			miconsola.imprimirString("Nota materia 2 " + lista.get(i).getNota_materia2());
			miconsola.imprimirString("Nota materia 3 " + lista.get(i).getNota_materia3());
			miconsola.imprimirString("Promedio " + lista.get(i).getPromedio());
			miconsola.imprimirString("\n");

		}
	}

	/**
	 * @return the miconsola
	 */
	public Consola getMiconsola() {
		return miconsola;
	}

	/**
	 * @param miconsola the miconsola to set
	 */
	public void setMiconsola(Consola miconsola) {
		this.miconsola = miconsola;
	}

	/**
	 * @return the lista
	 */
	public ArrayList<EstudianteDTO> getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(ArrayList<EstudianteDTO> lista) {
		this.lista = lista;
	}

	public ArrayList<EstudianteDTO> getRespaldo() {
		return respaldo;
	}

	public void setRespaldo(ArrayList<EstudianteDTO> respaldo) {
		this.respaldo = respaldo;
	}

}
