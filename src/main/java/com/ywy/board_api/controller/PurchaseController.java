package com.ywy.board_api.controller;

import com.ywy.board_api.Service.PurchaseService;
import com.ywy.board_api.entity.Article;
import com.ywy.board_api.entity.Purchase;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController

@RequestMapping(value = "/purchase")
@CrossOrigin(origins = "*")
public class PurchaseController {
    @Resource
    private PurchaseService purchaseService ;

    @GetMapping("/all")
    public List<Purchase> findAll(){
        return purchaseService.findAll();
    }

    @RequestMapping("/save")
    public Purchase save(Purchase purchase){
        return purchaseService.add(purchase) ;
    }

    @RequestMapping (value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam Integer id){
        purchaseService.delete(id);
    }
}
