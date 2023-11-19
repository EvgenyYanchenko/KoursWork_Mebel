package org.example.repositories;

import org.example.models.Stores;
import org.springframework.data.repository.CrudRepository;

public interface StoreSettingsRepository extends CrudRepository <Stores,String>{
}