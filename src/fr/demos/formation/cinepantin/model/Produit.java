package fr.demos.formation.cinepantin.model;

import java.util.Collection;

import javax.persistence.*;
@Entity
@Table(name="produit")
public class Produit {


@GeneratedValue(strategy = GenerationType.AUTO)
@Id
private int idProduit;
@Column(name="nom")
private String nom;
private double prixunitaire;
@Enumerated(EnumType.STRING)
@Column(name="fournisseur")
@JoinColumn(name="fournisseur")
@ManyToOne()
private Client client;
@Column(name="quantite")
private int quantite;

@Column(name="envente")
private boolean enVente;

public Produit(){
	
}

public Produit(int idProduit, String nom) {
	super();
	this.idProduit = idProduit;
	this.nom = nom;
}


public Produit(String nom, double prixunitaire) {
	super();
	this.nom = nom;
	this.prixunitaire = prixunitaire;
}

public Produit(String nom, double prixunitaire, Client client,
		int quantite, boolean lot) {
	super();
	this.nom = nom;
	this.prixunitaire = prixunitaire;
	this.client = client;
	this.quantite = quantite;
	
}

public Produit(int idProduit, String nom, double prixunitaire,
		Client client, int quantite, boolean lot, boolean enVente) {
	super();
	this.idProduit = idProduit;
	this.nom = nom;
	this.prixunitaire = prixunitaire;
	this.client = client;
	this.quantite = quantite;

	this.enVente = enVente;
}

public int getIdProduit() {
	return idProduit;
}

public void setIdProduit(int idProduit) {
	this.idProduit = idProduit;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public double getPrixunitaire() {
	return prixunitaire;
}

public void setPrixunitaire(double prixunitaire) {
	this.prixunitaire = prixunitaire;
}

public Client getFournisseur() {
	return client;
}

public void setFournisseur(Client client) {
	this.client = client;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public boolean isEnVente() {
	return enVente;
}

public void setEnVente(boolean enVente) {
	this.enVente = enVente;
}

@Override
public String toString() {
	return "produit " + ", nom=" + nom
			+ ", prixunitaire=" + prixunitaire + ", client=" + client
			+ ", quantite=" + quantite +"]";
}


}
