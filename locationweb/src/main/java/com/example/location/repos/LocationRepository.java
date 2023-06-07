package com.example.location.repos;

import com.example.location.entities.Location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> { // JPA Repository provide methods which returns lists in place of iterable

}
