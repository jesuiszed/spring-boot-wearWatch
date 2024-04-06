package ma.xproce.wearwatch.dao.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Montre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private Double prix;
    private Integer quantiteStock;

    /*@ManyToMany(mappedBy = "montre")
    private List<Panier> paniers;

    @ManyToMany(mappedBy = "montre")
    private List<Commande> commandes;
    */
    @ManyToMany
    private List<Categorie> categories;

   @ManyToOne
    private Marque marque;

}
