package fr.demos.formation.cinepantin.model;

public class DAOException extends RuntimeException {
	private static final long serialVersionUID = 1933561632667272154L;
	
	public DAOException(){
		super();
	}
	public DAOException(String mes){
		super(mes);
	}
}
