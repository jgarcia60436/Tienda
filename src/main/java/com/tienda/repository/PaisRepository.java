package com.tienda.repository;

import com.tienda.entity.Pais1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<Pais1,Long>{
    
}
