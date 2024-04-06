package ma.xproce.wearwatch.service;

import ma.xproce.wearwatch.dao.entities.Categorie;
import ma.xproce.wearwatch.dao.repository.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategorieService implements  CategorieManager {
    private CategorieRepository categorieRepository;
    @Override
    public Categorie addCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public List<Categorie> getAllProduct() {
        return categorieRepository.findAll();
    }

    @Override
    public Optional<Categorie> getProductById(Integer id) {
        return categorieRepository.findById(Long.valueOf(id));
    }

    @Override
    public void ajouterCategorie(Categorie categorie) {
         categorieRepository.save(categorie);

    }

    @Override
    public void modifierCategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    @Override
    public void supprimerCategorie(Integer id) {
            categorieRepository.deleteById(Long.valueOf(id));
    }
}
