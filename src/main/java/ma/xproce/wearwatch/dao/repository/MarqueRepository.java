package ma.xproce.wearwatch.dao.repository;

import ma.xproce.wearwatch.dao.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Long> {
    // Ajoutez ici des méthodes personnalisées si nécessaire
}
