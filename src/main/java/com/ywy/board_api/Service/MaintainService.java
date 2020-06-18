package com.ywy.board_api.Service;

import com.ywy.board_api.entity.Maintain;

import java.util.List;

public interface MaintainService {
    List<Maintain> findAll() ;

    void delete(int id ) ;

    Maintain add(Maintain Maintain) ;
}
