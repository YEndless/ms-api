package com.ywy.board_api.Service;

import com.ywy.board_api.entity.Subtenancy;

import java.util.List;

public interface SubtenancyService {
    List<Subtenancy> findAll() ;

    void delete(int id ) ;

    Subtenancy add(Subtenancy subtenancy) ;
}
