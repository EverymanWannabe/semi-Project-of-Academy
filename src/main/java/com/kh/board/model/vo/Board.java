package com.kh.board.model.vo;

import java.sql.Date;

public class Board {
	
	private int boardNo;
	private String boardTitle;
	private String boardCotent;
	private int count;
	private int likes;
	private Date createDate;
	private String status;
	private String boardWriter;
	private String categoryNo;
	private String userId;
	private String categoryName;
	
	public Board() {
		super();
	}
	
	public Board(int boardNo, String boardTitle, String boardCotent, int count, int likes, Date createDate,
			String userId, String categoryName) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardCotent = boardCotent;
		this.count = count;
		this.likes = likes;
		this.createDate = createDate;
		this.userId = userId;
		this.categoryName = categoryName;
	}






	public Board(int boardNo, String boardTitle, String boardCotent, int count, int likes, Date createDate,
			String status, String boardWriter, String categoryNo, String userId, String categoryName) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardCotent = boardCotent;
		this.count = count;
		this.likes = likes;
		this.createDate = createDate;
		this.status = status;
		this.boardWriter = boardWriter;
		this.categoryNo = categoryNo;
		this.userId = userId;
		this.categoryName = categoryName;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardCotent() {
		return boardCotent;
	}

	public void setBoardCotent(String boardCotent) {
		this.boardCotent = boardCotent;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardCotent=" + boardCotent + ", count="
				+ count + ", likes=" + likes + ", createDate=" + createDate + ", status=" + status + ", boardWriter="
				+ boardWriter + ", categoryNo=" + categoryNo + ", userId=" + userId + ", categoryName=" + categoryName
				+ "]";
	}

	

}
