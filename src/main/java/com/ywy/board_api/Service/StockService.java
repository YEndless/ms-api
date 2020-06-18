package com.ywy.board_api.Service;

import com.ywy.board_api.entity.Scrap;
import com.ywy.board_api.entity.Stock;

import java.util.List;

public interface StockService {
    List<Stock> findAll() ;

    void delete(int id ) ;

    Stock add(Stock stock) ;
}
