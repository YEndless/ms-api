package com.ywy.board_api.IService;


import com.ywy.board_api.Service.ArticleService;
import com.ywy.board_api.dao.ArticleRepository;
import com.ywy.board_api.entity.Article;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    ArticleRepository articleRepository ;

    @Override
    public List<Article> findAll() {
        return articleRepository.findAllDesc();
    }

    @Override
    public Article save(Article article) {
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr=str.replace("-", "");
        article.setArticleId(uuidStr);


        Date date=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.format(date);
        article.setSendTime(date);
        return articleRepository.save(article);
    }

    /**
     * tongguo openid得到 所有发布文章
     * @param openid
     * @return
     */
    @Override
    public List<Article> get(String openid) {
        return articleRepository.findAllByOpenidOrderByIdDesc(openid);
    }

    @Override
    public void delete(Integer id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void deleteByUId(int userId) {
        articleRepository.deleteByUId(userId);
    }

    @Override
    public List<Article> getAllArticle(int userId) {
        return articleRepository.findByUserId(userId);
    }

    @Override
    public void search(int id) {
        articleRepository.search(id);
    }

}
