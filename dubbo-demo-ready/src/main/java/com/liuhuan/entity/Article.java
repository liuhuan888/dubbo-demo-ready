package com.liuhuan.entity;

import java.util.Date;

public class Article {

	private Integer id;

	private String title;

	private String content;

	private String picture;

	private Integer channel_id;

	private String channelName;

	private Integer category_id;

	private String categoryName;

	private Integer user_id;

	private String nickname;

	private Integer hits;

	private Integer hot;

	private Integer status;

	private Integer deleted;

	private String created;

	private String updated;

	private int commentCnt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public int getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", picture=" + picture
				+ ", channel_id=" + channel_id + ", channelName=" + channelName + ", category_id=" + category_id
				+ ", categoryName=" + categoryName + ", user_id=" + user_id + ", nickname=" + nickname + ", hits="
				+ hits + ", hot=" + hot + ", status=" + status + ", deleted=" + deleted + ", created=" + created
				+ ", updated=" + updated + ", commentCnt=" + commentCnt + "]";
	}

	public Article(Integer id, String title, String content, String picture, Integer channel_id, String channelName,
			Integer category_id, String categoryName, Integer user_id, String nickname, Integer hits, Integer hot,
			Integer status, Integer deleted, String created, String updated, int commentCnt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.picture = picture;
		this.channel_id = channel_id;
		this.channelName = channelName;
		this.category_id = category_id;
		this.categoryName = categoryName;
		this.user_id = user_id;
		this.nickname = nickname;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.commentCnt = commentCnt;
	}

	public Article() {
		super();
	}

}
