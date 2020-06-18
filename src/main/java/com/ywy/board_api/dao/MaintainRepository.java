package com.ywy.board_api.dao;

import com.ywy.board_api.entity.Maintain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintainRepository extends JpaRepository<Maintain,Integer> {

}
