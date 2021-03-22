package com.example.demo.bbs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {
	
	@Id
	@GeneratedValue

	@Column(name = "article_no")
	private long articleNo;
	@Column(name = "title")
	private String title;
	@Column(name = "writer")
	private String writer;
	@Column(name = "click_view")
	private long clickView;
	@Column(name = "reg_data")
	private Date regData;
}
