package model;
import java.util.Date;
public class Board {
	private int id;			private String title;
	private String writer;	private String content;
	private int hit;		private Date regDate;
	
	public int getId() {	return id;	}
	public void setId(int id) {	this.id = id;	}
	public String getTitle() {	return title;	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {	return writer;	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {	return content;	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {	return hit;	}
	public void setHit(int hit) {	this.hit = hit;	}
	public Date getRegDate() {	return regDate;	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}	
}