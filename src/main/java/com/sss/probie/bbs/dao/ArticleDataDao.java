package com.sss.probie.bbs.dao;

import com.sss.probie.bbs.beans.view.Article;
import java.util.List;

/**
 * Created by K.Kangai on 2015/07/16.
 */
public interface ArticleDataDao {

    List<Article> selectAllArticle();

    Article getOneArticle(int articleId);

    void registArticle(Article article);
}
