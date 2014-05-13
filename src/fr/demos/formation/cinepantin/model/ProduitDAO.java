package fr.demos.formation.cinepantin.model;
import java.sql.SQLException;
import java.util.Collection;

import fr.demos.formation.cinepantin.model.DAOException;


public interface ProduitDAO {
	Produit findById(String id);
	Collection<Produit> findByTitre(String titre) ;
	Collection<Produit> findAll() throws SQLException, Exception;
	Collection<Produit> findByClient(Client client);
	
	void create(Produit d) throws DAOException, SQLException, Exception;
	void update(Produit d) throws DAOException;
	void delete(Produit d) throws DAOException;
	
}
