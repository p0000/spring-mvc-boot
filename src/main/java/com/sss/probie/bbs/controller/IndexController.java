package com.sss.probie.bbs.controller;

import com.sss.probie.bbs.beans.view.Article;
import com.sss.probie.bbs.service.ArticleService;
import com.sss.probie.bbs.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * Created by K.Kangai on 2015/07/14.
 */
@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private RegistService registService;

    @RequestMapping({"/","/bbs"})
    public String index(Model model) {
        List<Article> articles = articleService.getArticleList();
        model.addAttribute("article", new Article());
        model.addAttribute("articles", articles);
        return "bbs/bbs";
    }

    @RequestMapping("/reg")
    public String reg(Model model, @ModelAttribute("article") Article article) {
        //regist
        article.setDate(new Date());
        registService.regist(article);

        List<Article> articles = articleService.getArticleList();
        model.addAttribute("articles", articles);
        model.addAttribute("article", new Article());
        return "bbs/bbs";
    }
}
