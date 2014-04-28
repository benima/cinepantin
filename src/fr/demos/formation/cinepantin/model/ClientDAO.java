package fr.demos.formation.cinepantin.model;
import java.sql.SQLException;
import java.util.Collection;

import fr.demos.formation.cinepantin.model.DAOException;


public interface ClientDAO {
	Client findById(String id);
	Collection<Client> findByNom(String nom) ;
	Collection<Client> findAll() throws SQLException, Exception;
	Collection<Client> findByProduit(Produit Produit);
	void create(Client d) throws DAOException, SQLException, Exception;
	void update(Client d) throws DAOException;
	void delete(Client d) throws DAOException;
	
}
