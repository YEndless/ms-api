package com.ywy.board_api.controller;

import com.ywy.board_api.Service.ScrapService;
import com.ywy.board_api.Service.StockService;
import com.ywy.board_api.entity.Scrap;
import com.ywy.board_api.entity.Stock;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController

@RequestMapping(value = "/stock")
@CrossOrigin(origins = "*")
public class StockController {
    @Resource
    private StockService stockService ;

    @GetMapping("/all")
    public List<Stock> findAll(){
        return stockService.findAll();
    }

    @RequestMapping("/save")
    public Stock save(Stock stock){
        return stockService.add(stock) ;
    }

    @RequestMapping (value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam Integer id){
        stockService.delete(id);
    }
}
