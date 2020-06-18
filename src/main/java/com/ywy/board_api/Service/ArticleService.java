package com.ywy.board_api.Service;

import com.ywy.board_api.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAll() ;

    Article save(Article article) ;

    List<Article> get(String openid) ;

    void delete(Integer id) ;

    void deleteByUId(int userId) ;

    List<Article> getAllArticle(int userId) ;

    void search(int id) ;

}
