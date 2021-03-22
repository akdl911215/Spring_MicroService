package com.example.demo.bbs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boards")
public class Board {

	@Id
	@GeneratedValue
	
	@Column(name = "board_no")
	private long boardNo;
	@Column(name = "title")
	private String title;
	@Column(name = "writer")
	private String writer;
	@Column(name = "click_view")
	private long clickView;
	@Column(name = "reg_data")
	private Date regData;
}
