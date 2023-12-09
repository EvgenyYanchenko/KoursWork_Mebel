package org.example.repositories;

        import org.example.models.Dolgnosti;
        import org.example.models.Prodavcy;
        import org.springframework.data.repository.CrudRepository;

public interface ProdavcyRepository extends CrudRepository<Prodavcy, String> {

}