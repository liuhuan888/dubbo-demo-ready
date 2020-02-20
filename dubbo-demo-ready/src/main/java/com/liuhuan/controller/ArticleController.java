package com.liuhuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.liuhuan.entity.Article;
import com.liuhuan.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")Integer pageNum,
					   @RequestParam(defaultValue="10")Integer pageSize,
					   String start,String end,String field,Model model) {
		PageInfo<Article> pageInfo = articleService.list(pageNum,pageSize,start,end,field);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("start", start);
		model.addAttribute("end", end);
		model.addAttribute("field", field);
		return "list";
	}
}
