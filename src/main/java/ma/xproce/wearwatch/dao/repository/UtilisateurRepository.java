package ma.xproce.wearwatch.dao.repository;

import ma.xproce.wearwatch.dao.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    // Ajoutez ici des méthodes personnalisées si nécessaire
}
