package com.demo.springdemo.repository;

import com.demo.springdemo.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends JpaRepository<Band, Integer> {
}
