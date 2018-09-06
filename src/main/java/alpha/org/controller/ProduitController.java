package alpha.org.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alpha.org.entity.Produit;

@RestController
@RequestMapping("/api/produit")
public class ProduitController extends CrudController<Produit, Long>{

}
