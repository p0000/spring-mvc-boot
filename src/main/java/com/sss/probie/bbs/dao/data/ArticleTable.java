package com.sss.probie.bbs.dao.data;

import com.sss.probie.bbs.beans.view.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by K.Kangai on 2015/07/16.
 */
@Repository
public class ArticleTable {

    List<Article> articles = new ArrayList<>();

    public void addAnArticle(Article article) {
        article.setArticleId(this.articles.size() + 1);
        this.articles.add(article);
    }

    public Article getAnArticle(int articleId) {
        for (Article elem : articles) {
            if (articleId == elem.getArticleId()) {
                return elem;
            }
        }
        return null;
    }

    public List<Article> getAllArticle() {
        return articles;
    }
}
