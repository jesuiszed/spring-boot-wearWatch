package ma.xproce.wearwatch.dao.repository;

import ma.xproce.wearwatch.dao.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    // Ajoutez ici des méthodes personnalisées si nécessaire
}
