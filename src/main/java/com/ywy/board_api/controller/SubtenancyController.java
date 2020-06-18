package com.ywy.board_api.controller;

import com.ywy.board_api.Service.SubtenancyService;
import com.ywy.board_api.entity.Subtenancy;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController

@RequestMapping(value = "/subtenancy")
@CrossOrigin(origins = "*")
public class SubtenancyController {
    @Resource
    private SubtenancyService subtenancyService ;

    @GetMapping("/all")
    public List<Subtenancy> findAll(){
        return subtenancyService.findAll();
    }

    @RequestMapping("/save")
    public Subtenancy save(Subtenancy subtenancy){
        return subtenancyService.add(subtenancy) ;
    }

    @RequestMapping (value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam Integer id){
        subtenancyService.delete(id);
    }
}
