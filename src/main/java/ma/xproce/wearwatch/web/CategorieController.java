package ma.xproce.wearwatch.web;
import ma.xproce.wearwatch.service.CategorieManager;
import ma.xproce.wearwatch.dao.entities.Categorie;
import ma.xproce.wearwatch.dao.entities.Montre;
import ma.xproce.wearwatch.dao.repository.CategorieRepository;
import ma.xproce.wearwatch.service.CategorieManager;
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
public class CategorieController {
    @Autowired
    private  CategorieManager categorieManager ;


   @GetMapping("categorie")
   public String categorie (Model model){
       List<Categorie> categories = categorieManager.getAllProduct();
       model.addAttribute("listCategories",categories);
       return "categorie";
   }
}