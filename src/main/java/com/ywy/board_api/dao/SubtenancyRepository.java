package com.ywy.board_api.dao;

import com.ywy.board_api.entity.Subtenancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubtenancyRepository extends JpaRepository<Subtenancy,Integer> {
}
