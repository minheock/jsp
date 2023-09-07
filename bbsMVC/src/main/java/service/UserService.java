package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.UserDao;
import jdbc.ConnectionPool;
import model.BbsVO;
import model.UserVO;

// DAO 사용하는 비지니스 로직 
public class UserService {
	private ConnectionPool cp = ConnectionPool.getInstance();
	private UserDao dao = UserDao.getInstance();
	private static UserService instance = new UserService();
	public static UserService getInstance() {
		return instance;
	}
	// 로그인
	public UserVO loginUser(String id, String pw) {
		Connection conn = cp.getConnection();
		try {
			UserVO vo =  dao.loginUser(conn, id);
			if(vo.getUserId() != null) {
				if(vo.getUserPw().equals(pw)) {
					return vo;
				}
			}
		} catch (Exception e) {
		}finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return null;
	}
	
	//회원정보 조회
		public UserVO UserInfo(String id) {
			Connection conn = cp.getConnection();
			try {
				UserVO vo =  dao.loginUser(conn, id);
				return vo;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(conn != null) cp.releaseConnection(conn);
			}
			return null;
		}
	
	
	// 회원가입(INSERT)
	public int insertUser(UserVO user) {
		Connection conn = cp.getConnection();
		try {
			return dao.insertUser(conn, user);
		} catch (SQLException e) {
			System.out.println("중복된 아이디 입니다.");
			e.printStackTrace();
		}
		return 0;
	}
//	회원정보 수정
	public int updateUser(UserVO user) {
		Connection conn = cp.getConnection();
		try {
			return dao.updateUser(conn, user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}	
	// 전체 게시글 목록 조회
	public ArrayList<BbsVO> bbsList (){
		Connection conn = cp.getConnection();
		try { 
			return dao.bbsList(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			if(conn != null) cp.releaseConnection(conn);
//		}
		return null;
	}
	
	// 게시글 상세내용 조회
	public ArrayList<BbsVO> bbsContent() {
		Connection conn = cp.getConnection();
		try {
			return dao.bbsContent(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}
	
	
}
