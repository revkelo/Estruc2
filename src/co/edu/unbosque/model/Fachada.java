package co.edu.unbosque.model;

public class Fachada {
	private AsignaturaDAO asigdao;
	private EstudianteDAO estudao;
	private Ordenamiento orde;

	public Fachada() {
		orde = new Ordenamiento();
		asigdao = new AsignaturaDAO();
		estudao = new EstudianteDAO();
	}

	public Ordenamiento getOrde() {
		return orde;
	}

	public void setOrde(Ordenamiento orde) {
		this.orde = orde;
	}

	/**
	 * @return the asigdao
	 */
	public AsignaturaDAO getAsigdao() {
		return asigdao;
	}

	/**
	 * @param asigdao the asigdao to set
	 */
	public void setAsigdao(AsignaturaDAO asigdao) {
		this.asigdao = asigdao;
	}

	/**
	 * @return the estudao
	 */
	public EstudianteDAO getEstudao() {
		return estudao;
	}

	/**
	 * @param estudao the estudao to set
	 */
	public void setEstudao(EstudianteDAO estudao) {
		this.estudao = estudao;
	}

}
