package com.kh.board.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.board.model.vo.Board;
import com.kh.common.JDBCTemplate;

public class BoardDao {
	
	private Properties prop = new Properties();
	
	public BoardDao() {
		String filePath = BoardDao.class.getResource("/resources/sql/board-mapper.xml").getPath();
		try {
			prop.loadFromXML(new FileInputStream(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//리스트 전부 가져오기
	public ArrayList<Board> boardList(Connection conn) {
		
		ArrayList<Board> list = new ArrayList<>();
		ResultSet rset = null;
		Statement stmt = null;
		String sql = prop.getProperty("boardList");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			while(rset.next()) {
				list.add(new Board(
						     rset.getInt("BOARD_NO")
							,rset.getString("BOARD_TITLE")
							,rset.getString("BOARD_CONTENT")
							,rset.getInt("COUNT")
							,rset.getInt("LIKES")
							,rset.getDate("CREATE_DATE")
							,rset.getString("USER_ID")
							,rset.getString("CATEGORY_NAME")
						));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return list;
	}

	//조회수 증가
	public int boardCount(Connection conn, int bno) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("boardCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	//좋아요 증가
	public int likesCount(Connection conn, int bno) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("likesCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public Board boardDetail(Connection conn, int bno) {
		
		Board b = new Board();
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("boardDetail");
		
		
		
		return b;
	}
	

}


















