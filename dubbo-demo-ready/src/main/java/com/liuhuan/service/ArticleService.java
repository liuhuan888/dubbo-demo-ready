package com.liuhuan.service;

import com.github.pagehelper.PageInfo;
import com.liuhuan.entity.Article;

public interface ArticleService {

	PageInfo<Article> list(Integer pageNum, Integer pageSize, String start, String end, String field);

}
