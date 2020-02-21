package com.rubypaper.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Board
 *
 */
@Entity
@Table(name="BOARD")
@SequenceGenerator(
		name="BOARD_SEQ",
		sequenceName = "BOARD_SEQ",
		initialValue = 1,
		allocationSize = 1
							)
public class Board implements Serializable {
	@Id
	//@SequenceGenerator(name = "BOARD_SEQ", sequenceName = "BOARD_SEQ",schema="HR")
	//@GeneratedValue
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ")
	//@Column(name = "BOARD_SEQ")
	//@SequenceGenerator(name="BOARD_SEQ", sequenceName="BOARD_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
					generator="BOARD_SEQ")
	@Column(nullable = false)
	private Long seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate;
	private Long cnt;
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getCnt() {
		return cnt;
	}
	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", content=" + content + ", createDate=" + createDate
				+ ", cnt=" + cnt + "]";
	}
	
	
   
}
