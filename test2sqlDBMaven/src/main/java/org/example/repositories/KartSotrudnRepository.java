package org.example.repositories;

        import org.example.models.Dolgnosti;
        import org.example.models.Kartochki_sotrudnikov;
        import org.springframework.data.repository.CrudRepository;

public interface KartSotrudnRepository extends CrudRepository<Kartochki_sotrudnikov, Long> {

}