package ma.xproce.wearwatch.web;

import ma.xproce.wearwatch.dao.entities.Montre;
import ma.xproce.wearwatch.service.MontreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class MontreController {
    @Autowired
    private MontreManager montreManager;
    // get index

    @GetMapping("index")
    public String acceuil (Model model){
        List<Montre> montres = montreManager.getAllProduct();
        model.addAttribute("listMontres",montres);
        return "index";
    }

    @GetMapping("")
    public String acceuil1() {
        return "redirect:/index";
    }

    //get details product

    @GetMapping("detailsProduct")
    public String detailProduct(Model model,
                                @RequestParam(name = "id") Integer id) {

        Montre product = montreManager.getProductById(id);
        model.addAttribute("productWithDetails", product);
        return "detailProduit" ;

    }

    // Formulaire d'ajout de produit
    @GetMapping("/ajouterProduit")
    public String afficherFormulaireAjoutProduit(Model model) {
        model.addAttribute("produit", new Montre());
        return "ajouterProduit";
    }

    // Ajouter un produit
    @PostMapping("/ajouterProduit")
    public String ajouterProduit(@ModelAttribute("produit") Montre produit) {
        montreManager.ajouterProduit(produit);
        return "redirect:/index";
    }


    @GetMapping("/modifierProduit")
    public String afficherFormulaireModifierProduit(Model model, @RequestParam(name = "id") Integer id) {
        Montre produit = montreManager.getProductById(id);
        model.addAttribute("produit", produit);
        return "modifierProduit";
    }

    @PostMapping("/modifierProduit")
    public String modifierProduit(@ModelAttribute("produit") Montre produit) {
        montreManager.modifierProduit(produit);
        return "redirect:/index";
    }

    @GetMapping("/supprimerProduit")
    public String supprimerProduit(@RequestParam(name = "id") Integer id) {
        montreManager.supprimerProduit(id);
        return "redirect:/index";
    }

    //page utilisateur
    @GetMapping("/listeProduits")
    public String afficherListeProduits(Model model) {
        List<Montre> listeProduits = montreManager.getAllProduct();
        model.addAttribute("listeProduits", listeProduits);
        return "listeProduits"; // Le nom de la vue à afficher
    }


}
