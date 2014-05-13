package fr.demos.formation.cinepantin.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.List;

public class TestChargerProduit {
	
	public static void main (String[] args) throws Exception {
		/*
		FileReader fic=new FileReader("C:/Users/BEN/Documents/CQP/STAGE2014-01/SWSandro/Docs/FicherProduit.csv");
		BufferedReader br = new BufferedReader (fic);
		String line=null;
		
		while ((line=br.readLine()) != null) System.out.println(line);
		
		br.reset();
		fic.close();
		*/
		ProduitDAOMySQL dao = new ProduitDAOMySQL();
		List<Produit> produits;
		//Collection<Produit> produits;
		String fichier = "C:/Users/BEN/Documents/CQP/STAGE2014-01/SWSandro/Docs/FicherProduit.csv";
		produits = (List<Produit>) dao.chargerProduit(fichier);
		
		// Afficher la liste des produits:
		for (int i=0; i< produits.size(); i++) {
			System.out.println(produits.get(i));
		}
		
		System.out.println("***************************************************");
		System.out.println(dao.findById(2));
		System.out.println(dao.findById(4));
		System.out.println(dao.findById(5));
		System.out.println(dao.findById(10));
		System.out.println(dao.findById(15));
	}

}
