package alpha.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import alpha.org.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
}
