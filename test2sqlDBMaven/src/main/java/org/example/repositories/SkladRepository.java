package org.example.repositories;

import org.example.models.Sklady;
import org.springframework.data.repository.CrudRepository;

public interface SkladRepository extends CrudRepository <Sklady, String> {
}
