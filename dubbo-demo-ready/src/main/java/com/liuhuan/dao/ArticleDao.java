package com.liuhuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuhuan.entity.Article;

public interface ArticleDao {

	List<Article> list(@Param("start")String start, @Param("end")String end, @Param("field")String field);

}
