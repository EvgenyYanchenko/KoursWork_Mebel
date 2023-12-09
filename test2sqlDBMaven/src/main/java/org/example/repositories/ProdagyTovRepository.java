package org.example.repositories;

        import org.example.models.Dolgnosti;
        import org.example.models.Prodazhy_tovarov;
        import org.springframework.data.repository.CrudRepository;

public interface ProdagyTovRepository extends CrudRepository<Prodazhy_tovarov, Long> {

}