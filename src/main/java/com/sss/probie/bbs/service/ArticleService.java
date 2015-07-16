package com.sss.probie.bbs.service;

import com.sss.probie.bbs.beans.view.Article;

import java.util.List;

/**
 * Created by K.Kangai on 2015/07/16.
 */
public interface ArticleService {

    List<Article> getArticleList();

    Article getAnArticle(int articleId);
}
