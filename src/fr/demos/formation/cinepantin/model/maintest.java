package fr.demos.formation.cinepantin.model;

import java.sql.SQLException;

public class maintest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ProduitDAOMock livre1 = null;
		try {
			System.out.println(livre1.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
