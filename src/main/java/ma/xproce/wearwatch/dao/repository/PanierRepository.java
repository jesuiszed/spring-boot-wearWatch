package ma.xproce.wearwatch.dao.repository;

import ma.xproce.wearwatch.dao.entities.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanierRepository extends JpaRepository<Panier, Long> {
    // Ajoutez ici des méthodes personnalisées si nécessaire
}
