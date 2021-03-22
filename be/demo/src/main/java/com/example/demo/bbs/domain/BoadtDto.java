package com.example.demo.bbs.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoadtDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long boardNo;
	private String title;
	private String writer;
	private long clickView;
	private Date regData;
}
