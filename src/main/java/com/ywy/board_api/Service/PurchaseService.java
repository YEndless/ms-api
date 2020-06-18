package com.ywy.board_api.Service;

import com.ywy.board_api.entity.Purchase;

import java.util.List;

public interface PurchaseService {
    List<Purchase> findAll() ;

    void delete(int id ) ;

    Purchase add(Purchase purchase) ;
}
