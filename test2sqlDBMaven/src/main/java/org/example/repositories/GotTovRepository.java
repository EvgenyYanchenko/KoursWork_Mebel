package org.example.repositories;

        import org.example.models.Dolgnosti;
        import org.example.models.Gotov_tovary;
        import org.springframework.data.repository.CrudRepository;

public interface GotTovRepository extends CrudRepository<Gotov_tovary, Long> {

}