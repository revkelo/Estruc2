package co.edu.unbosque.model;

public class AsignaturaDTO {
	private String nombre_asignatura;
	private String estudiante;
	private double nota_materia;

	public AsignaturaDTO() {
		// TODO Auto-generated constructor stub
	}



	public AsignaturaDTO(String nombre_asignatura, String estudiante, double nota_materia) {
		super();
		this.nombre_asignatura = nombre_asignatura;
		this.estudiante = estudiante;
		this.nota_materia = nota_materia;
	}



	/**
	 * @return the estudiante
	 */
	public String getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * @return the nota_materia
	 */
	public double getNota_materia() {
		return nota_materia;
	}

	/**
	 * @param nota_materia the nota_materia to set
	 */
	public void setNota_materia(double nota_materia) {
		this.nota_materia = nota_materia;
	}

	public String getNombre_asignatura() {
		return nombre_asignatura;
	}

	/**
	 * @param nombre_asignatura the nombre_asignatura to set
	 */
	public void setNombre_asignatura(String nombre_asignatura) {
		this.nombre_asignatura = nombre_asignatura;
	}


}
