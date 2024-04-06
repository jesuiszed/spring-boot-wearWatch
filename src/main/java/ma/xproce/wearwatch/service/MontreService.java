package ma.xproce.wearwatch.service;


import ma.xproce.wearwatch.dao.entities.Montre;
import ma.xproce.wearwatch.dao.repository.MontreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MontreService implements MontreManager{
    @Autowired
    private MontreRepository montreRepository;
    @Override
    public Montre addMontre(Montre montre){

        try{
            return  montreRepository.save(montre);
        }catch (Exception exception){
            System.out.println(exception.getMessage()); //Logger
            return null;
        }
    }
    @Override
    public List<Montre> getAllProduct() {
        return montreRepository.findAll();
    }

    @Override
    public Montre getProductById(Integer id) {
        return montreRepository.findById(Long.valueOf(id)).get();
    }

    @Override
    public void ajouterProduit(Montre montre){
        montreRepository.save(montre);
    }

    @Override
    public void modifierProduit(Montre montre) {
        montreRepository.save(montre);
    }

    @Override
    public void supprimerProduit(Integer id) {
        montreRepository.deleteById(Long.valueOf(id));
    }
}
