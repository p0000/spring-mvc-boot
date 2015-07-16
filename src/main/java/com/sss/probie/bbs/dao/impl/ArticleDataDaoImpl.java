package com.sss.probie.bbs.dao.impl;

import com.sss.probie.bbs.beans.view.Article;
import com.sss.probie.bbs.dao.ArticleDataDao;
import com.sss.probie.bbs.dao.data.ArticleTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by K.Kangai on 2015/07/16.
 */
@Component
public class ArticleDataDaoImpl implements ArticleDataDao {

    @Autowired
    private ArticleTable table;

    @Override
    public List<Article> selectAllArticle() {
        return table.getAllArticle();
    }

    @Override
    public Article getOneArticle(int articleId) {
        return table.getAnArticle(articleId);
    }

    @Override
    public void registArticle(Article article) {
        table.addAnArticle(article);
    }
}
