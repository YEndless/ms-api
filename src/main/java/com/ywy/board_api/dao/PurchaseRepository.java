package com.ywy.board_api.dao;

import com.ywy.board_api.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {

    @Query("select p FROM Purchase   p ORDER BY p.id DESC ")
    List<Purchase> findAllDesc();

//    void deleteById() ;


}
