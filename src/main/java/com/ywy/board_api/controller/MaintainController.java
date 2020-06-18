package com.ywy.board_api.controller;

import com.ywy.board_api.Service.MaintainService;
import com.ywy.board_api.Service.PurchaseService;
import com.ywy.board_api.entity.Maintain;
import com.ywy.board_api.entity.Purchase;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController

@RequestMapping(value = "/maintain")
@CrossOrigin(origins = "*")
public class MaintainController {
    @Resource
    private MaintainService maintainService ;

    @GetMapping("/all")
    public List<Maintain> findAll(){
        return maintainService.findAll();
    }

    @RequestMapping("/save")
    public Maintain save(Maintain maintain){
        return maintainService.add(maintain) ;
    }

    @RequestMapping (value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam Integer id){
        maintainService.delete(id);
    }
}
