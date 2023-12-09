package org.example.repositories;

import org.example.models.Zakazy;
import org.springframework.data.repository.CrudRepository;

public interface ZakazyRepository extends CrudRepository <Zakazy, Long>{
}
