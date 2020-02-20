package com.liuhuan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuhuan.dao.ArticleDao;
import com.liuhuan.entity.Article;
import com.liuhuan.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public PageInfo<Article> list(Integer pageNum, Integer pageSize, String start, String end, String field) {
		PageHelper.startPage(pageNum, pageSize);
		System.err.println(start+"=="+end+"=="+field);
		List<Article> list = articleDao.list(start,end,field);
		return new PageInfo<>(list);
	}
}
