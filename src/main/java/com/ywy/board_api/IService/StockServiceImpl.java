package com.ywy.board_api.IService;

import com.ywy.board_api.Service.StockService;
import com.ywy.board_api.dao.StockRepository;
import com.ywy.board_api.entity.Stock;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Resource
    StockRepository stockRepository ;

    @Override
    public List<Stock> findAll() {
        return stockRepository.findAll() ;
    }

    @Override
    public void delete(int id) {
        stockRepository.deleteById(id);

    }

    @Override
    public Stock add(Stock stock) {
        return stockRepository.save(stock);
    }
}
