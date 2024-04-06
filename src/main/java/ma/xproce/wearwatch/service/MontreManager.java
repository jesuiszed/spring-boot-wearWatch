package ma.xproce.wearwatch.service;

import ma.xproce.wearwatch.dao.entities.Montre;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MontreManager {
    public Montre addMontre(Montre montre );

    List<Montre> getAllProduct();

    Montre getProductById(Integer id);

    void ajouterProduit(Montre montre);

    void modifierProduit(Montre produit);

    void supprimerProduit(Integer id);
}
