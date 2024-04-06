package ma.xproce.wearwatch.service;

import ma.xproce.wearwatch.dao.entities.Categorie;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Component
public interface CategorieManager {

    public Categorie addCategorie(Categorie categorie );

    List<Categorie> getAllProduct();

    Optional<Categorie> getProductById(Integer id);

    void ajouterCategorie(Categorie categorie);

    void modifierCategorie(Categorie categorie);

    void supprimerCategorie(Integer id);
}
