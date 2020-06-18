package com.ywy.board_api.IService;

import com.ywy.board_api.Service.MaintainService;
import com.ywy.board_api.dao.MaintainRepository;
import com.ywy.board_api.dao.PurchaseRepository;
import com.ywy.board_api.entity.Maintain;
import com.ywy.board_api.entity.Purchase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MaintainServiceImpl implements MaintainService {
    @Resource
    MaintainRepository maintainRepository ;

    @Override
    public List<Maintain> findAll() {
        return maintainRepository.findAll() ;
    }

    @Override
    public void delete(int id) {
        maintainRepository.deleteById(id);
    }

    @Override
    public Maintain add(Maintain maintain) {

        return maintainRepository.save(maintain);
    }
}
