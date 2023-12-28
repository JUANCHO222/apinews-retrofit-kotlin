package com.tesji.news_retrofit.repository

import com.tesji.news_retrofit.api.RetrofitInstance
import com.tesji.news_retrofit.db.ArticleDatabase
import com.tesji.news_retrofit.models.Article

class NewsRepository(val db: ArticleDatabase) {
    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int)=
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert (article: Article) = db.getArticleDao().upsert(article)

    fun getFavouriteNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)


}