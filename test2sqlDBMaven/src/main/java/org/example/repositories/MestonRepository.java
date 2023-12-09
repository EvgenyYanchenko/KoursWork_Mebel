package org.example.repositories;

        import org.example.models.Dolgnosti;
        import org.example.models.Mestonahogdenie;
        import org.springframework.data.repository.CrudRepository;

public interface MestonRepository extends CrudRepository<Mestonahogdenie, Long> {

}