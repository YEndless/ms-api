package com.ywy.board_api.dao;

import com.ywy.board_api.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer>{
    @Transactional
    @Modifying
    @Query(value="delete from article where user_id = ?1", nativeQuery=true)
    void deleteByUId(int UserId);

    @Transactional
    @Modifying
    @Query(value="SELECT nick_name FROM article a LEFT  JOIN user u ON a.user_id = u.id", nativeQuery=true)
    void search(int uid);

    List<Article> findByUserId(int userId) ;


//    @Query(value = "select a FROM article  a  ON a.openid = ?1 ORDER BY a.id DESC", nativeQuery=true)
//    List<Article> find(String openid); //升序降序


    List<Article> findAllByOpenidOrderByIdDesc(String openid); //升序降序

    @Query("select a FROM Article  a ORDER BY a.id DESC ")
    List<Article> findAllDesc();

}
