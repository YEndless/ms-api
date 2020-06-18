package com.ywy.board_api.dao;

import com.ywy.board_api.entity.Scrap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScrapRepository extends JpaRepository<Scrap,Integer> {
}
