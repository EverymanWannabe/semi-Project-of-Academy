package com.kh.board.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.board.model.dao.BoardDao;
import com.kh.board.model.vo.Board;
import com.kh.common.JDBCTemplate;

public class BoardService {

	//리스트 전부 가져오기
	public ArrayList<Board> boardList() {
		
		Connection conn = JDBCTemplate.getConnection();
		
		ArrayList <Board> list = new BoardDao().boardList(conn);
		
		JDBCTemplate.close(conn);
		
		return list;
	}

	//조회수증가
	public int boardCount(int bno) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result = new BoardDao().boardCount(conn,bno);
		
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}

	//좋아요증가
	public int likesCount(int bno) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result = new BoardDao().likesCount(conn,bno);
		
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}

	//게시글 클릭시 상세보기
	public Board boardDetail(int bno) {
		
		Connection conn = JDBCTemplate.getConnection();
		
		Board b = new BoardDao().boardDetail(conn,bno);
		
		JDBCTemplate.close(conn);
		
		return b;
	}
	
	

}
