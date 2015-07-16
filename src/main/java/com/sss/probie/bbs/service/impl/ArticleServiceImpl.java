package com.sss.probie.bbs.service.impl;

import com.sss.probie.bbs.beans.view.Article;
import com.sss.probie.bbs.dao.ArticleDataDao;
import com.sss.probie.bbs.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by K.Kangai on 2015/07/16.
 */
@Component
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDataDao articleDataDao;

    @Override
    public Article getAnArticle(int articleId) {
        Article article = articleDataDao.getOneArticle(articleId);
        return article;
    }

    @Override
    public List<Article> getArticleList() {
        List<Article> list = articleDataDao.selectAllArticle();
        return list;
    }
}
