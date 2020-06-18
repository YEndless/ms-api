package com.ywy.board_api.Service;

import com.ywy.board_api.entity.Scrap;

import java.util.List;

public interface ScrapService {
    List<Scrap> findAll() ;

    void delete(int id ) ;

    Scrap add(Scrap scrap) ;
}
