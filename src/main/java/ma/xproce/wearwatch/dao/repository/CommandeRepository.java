package ma.xproce.wearwatch.dao.repository;

import ma.xproce.wearwatch.dao.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    // Ajoutez ici des méthodes personnalisées si nécessaire
}
