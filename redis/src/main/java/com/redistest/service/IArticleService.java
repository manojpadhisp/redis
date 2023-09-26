package com.redistest.service;

import com.redistest.entity.Article;

import java.util.List;

public interface IArticleService {

    List<Article> getAllArticles();
    Article getArticleById(long articleId);
    Article addArticle(Article article);
    Article updateArticle(Article article);
    void deleteArticle(long articleId);
}
