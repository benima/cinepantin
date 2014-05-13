package fr.demos.formation.cinepantin.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class ProduitDAOMock implements ProduitDAO {

	@Override
	public Produit findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Produit> findByTitre(String titre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Produit> findAll() throws SQLException, Exception {
		// TODO Auto-generated method stub
		ArrayList<Produit> liste = new ArrayList<>();
		liste.add(new Produit(1,"22RR33"));
		liste.add(new Produit(2,"44RR55"));
		liste.add(new Produit(3,"66RR77"));
		
		return liste;

	}

	@Override
	public Collection<Produit> findByClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Produit d) throws DAOException, SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Produit d) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Produit d) throws DAOException {
		// TODO Auto-generated method stub
		
	}

// le Mock simule le comportement d'une connection à une interface


}
