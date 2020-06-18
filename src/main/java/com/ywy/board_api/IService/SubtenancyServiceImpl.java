package com.ywy.board_api.IService;

import com.ywy.board_api.Service.SubtenancyService;
import com.ywy.board_api.dao.SubtenancyRepository;
import com.ywy.board_api.entity.Subtenancy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubtenancyServiceImpl implements SubtenancyService {
    @Resource
    SubtenancyRepository subtenancyRepository ;
    @Override
    public List<Subtenancy> findAll() {
        return subtenancyRepository.findAll();
    }

    @Override
    public void delete(int id) {
        subtenancyRepository.deleteById(id);
    }

    @Override
    public Subtenancy add(Subtenancy subtenancy) {
        return subtenancyRepository.save(subtenancy);
    }
}
