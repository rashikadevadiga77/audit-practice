package com.rashika.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rashika.entity.Bar;

@Repository
public interface BarRepository extends CrudRepository<Bar, Integer>{

}
