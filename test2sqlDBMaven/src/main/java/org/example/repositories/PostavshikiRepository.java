package org.example.repositories;

        import org.example.models.Dolgnosti;
        import org.example.models.Postavshiki;
        import org.springframework.data.repository.CrudRepository;

public interface PostavshikiRepository extends CrudRepository<Postavshiki, Long> {

}