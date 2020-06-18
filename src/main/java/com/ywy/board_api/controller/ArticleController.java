package com.ywy.board_api.controller;


import com.ywy.board_api.Service.ArticleService;
import com.ywy.board_api.entity.Article;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController

@RequestMapping(value = "/article")
@CrossOrigin(origins = "*")
public class ArticleController {

    @Resource
    private ArticleService articleService ;

//
    @GetMapping("/all")
    public List<Article> findAll(){
        return articleService.findAll();
    }

    /**
     * 通过openid查所有文章
     * @param openid
     * @return
     */
    @GetMapping("/{openid}")
    public List<Article> getArticle(@PathVariable String openid   ){
        return articleService.get(openid) ;
    }

    @RequestMapping("/save")
    public Article save(Article article){
        return articleService.save(article) ;
    }

    @RequestMapping (value = "/delete1",method = RequestMethod.DELETE)
    public void delete(@RequestParam Integer id){
        articleService.delete(id);
    }

    @GetMapping("/deleteByUId")
    public void deleteByUserId(int userId){
        articleService.deleteByUId(userId);
    }

    @RequestMapping(value = "/search/{id}",method = RequestMethod.GET)
    public void search(@PathVariable int id){
         articleService.search(id);
    }
}
