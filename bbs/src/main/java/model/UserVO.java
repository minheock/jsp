package model;
// value object
public class UserVO {
	private String userId;
	private String userPw;
	private String userNm;
	private String userMail;
	private int userMileage;
	private String create_dt;
	private String update_dt;
	private String use_yn;
	
	
	
	
	/**
	 * @param userId
	 * @param userPw
	 * @param userNm
	 */
	public UserVO(String userId, String userPw, String userNm) {
		this.userId = userId;
		this.userNm = userNm;
		this.userPw = userPw;		
	}
	public UserVO() {
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public int getUserMileage() {
		return userMileage;
	}
	public void setUserMileage(int userMileage) {
		this.userMileage = userMileage;
	}
	public String getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(String create_dt) {
		this.create_dt = create_dt;
	}
	public String getUpdate_dt() {
		return update_dt;
	}
	public void setUpdate_dt(String update_dt) {
		this.update_dt = update_dt;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPw=" + userPw + ", userNm=" + userNm + ", userMail=" + userMail
				+ ", userMileage=" + userMileage + ", create_dt=" + create_dt + ", update_dt=" + update_dt + ", use_yn="
				+ use_yn + "]";
	}
	
	
}
