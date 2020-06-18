package com.ywy.board_api.controller;

import com.ywy.board_api.Service.PurchaseService;
import com.ywy.board_api.Service.ScrapService;
import com.ywy.board_api.entity.Scrap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController

@RequestMapping(value = "/scrap")
@CrossOrigin(origins = "*")
public class ScrapController {
    @Resource
    private ScrapService scrapService ;

    @GetMapping("/all")
    public List<Scrap> findAll(){
        return scrapService.findAll();
    }

    @RequestMapping("/save")
    public Scrap save(Scrap scrap){
        return scrapService.add(scrap) ;
    }

    @RequestMapping (value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam Integer id){
        scrapService.delete(id);
    }
}
