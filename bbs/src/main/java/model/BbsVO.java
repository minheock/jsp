package model;

public class BbsVO {
	 private int rnum;     
     private int allCnt;     
     private int bbsNo;     
     private String status;
     private String bbsContent;
     private String bbsTitle;   
     private String authorId;   
     
     /**
	 * @param rnum
	 * @param allCnt
	 * @param bbsNo
	 * @param status
	 * @param bbsContent
	 * @param bbsTitle
	 * @param authorId
	 * @param updateDt
	 */
	public BbsVO(int rnum, int allCnt, int bbsNo, String status, String bbsContent, String bbsTitle, String authorId,
			String updateDt) {
		this.rnum = rnum;
		this.allCnt = allCnt;
		this.bbsNo = bbsNo;
		this.status = status;
		this.bbsContent = bbsContent;
		this.bbsTitle = bbsTitle;
		this.authorId = authorId;
		this.updateDt = updateDt;
	}
	public BbsVO(){
		
	}
	
	@Override
	public String toString() {
		return "BbsVO [rnum=" + rnum + ", allCnt=" + allCnt + ", bbsNo=" + bbsNo + ", status=" + status
				+ ", bbsContent=" + bbsContent + ", bbsTitle=" + bbsTitle + ", authorId=" + authorId + ", updateDt="
				+ updateDt + "]";
	}


	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public int getAllCnt() {
		return allCnt;
	}
	public void setAllCnt(int allCnt) {
		this.allCnt = allCnt;
	}
	public int getBbsNo() {
		return bbsNo;
	}
	public void setBbsNo(int bbsNo) {
		this.bbsNo = bbsNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBbsContent() {
		return bbsContent;
	}
	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}
	public String getBbsTitle() {
		return bbsTitle;
	}
	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	private String updateDt;

     
     
}

	