package alpha.org.service;

import java.util.List;

import alpha.org.entity.Produit;

public interface IProduitService {

	List<Produit> getProduits();
	void addProduit(Produit produit);
	void updateProduit(Produit produit);
	void deleteProduit(Long id);
}