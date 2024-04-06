package ma.xproce.wearwatch.dao.repository;

import ma.xproce.wearwatch.dao.entities.Montre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MontreRepository extends JpaRepository<Montre, Long> {
    // Ajoutez ici des méthodes personnalisées si nécessaire
}
