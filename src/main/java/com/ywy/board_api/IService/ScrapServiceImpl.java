package com.ywy.board_api.IService;

import com.ywy.board_api.Service.ScrapService;
import com.ywy.board_api.dao.ScrapRepository;
import com.ywy.board_api.entity.Scrap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScrapServiceImpl  implements ScrapService {
    @Resource
    ScrapRepository scrapRepository ;

    @Override
    public List<Scrap> findAll() {
        return scrapRepository.findAll() ;
    }

    @Override
    public void delete(int id) {
        scrapRepository.deleteById(id);

    }

    @Override
    public Scrap add(Scrap scrap) {
        return scrapRepository.save(scrap);
    }
}
