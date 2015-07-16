package com.sss.probie.bbs.service.impl;

import com.sss.probie.bbs.beans.view.Article;
import com.sss.probie.bbs.dao.ArticleDataDao;
import com.sss.probie.bbs.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by K.Kangai on 2015/07/16.
 */
@Component
public class RegistServiceImpl implements RegistService {
    @Autowired
    private ArticleDataDao articleDataDao;

    @Override
    public void regist(Article article) {
        articleDataDao.registArticle(article);
    }
}
