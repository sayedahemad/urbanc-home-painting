package com.company.urban.homepainting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.urban.homepainting.entity.HomePainting;

public interface HomePaintingRepository extends JpaRepository<HomePainting, Integer> {

}
