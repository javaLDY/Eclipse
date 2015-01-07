package entity;

import java.sql.Date;

public class UserInfo {

	private int Id;
	
	private String LoginName;
	
	private SexCode sexcode;
	
	private String LoginPass;
	
	private String LogProQuestion;
	
	private String LogAnswer;
	
	private Date Birthday;
	
	private String FalseName;
	
	private String ProEmail;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getLoginName() {
		return LoginName;
	}

	public void setLoginName(String loginName) {
		LoginName = loginName;
	}

	public String getLoginPass() {
		return LoginPass;
	}

	public void setLoginPass(String loginPass) {
		LoginPass = loginPass;
	}

	public String getLogProQuestion() {
		return LogProQuestion;
	}

	public void setLogProQuestion(String logProQuestion) {
		LogProQuestion = logProQuestion;
	}

	public String getLogAnswer() {
		return LogAnswer;
	}

	public void setLogAnswer(String logAnswer) {
		LogAnswer = logAnswer;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}

	public String getFalseName() {
		return FalseName;
	}

	public void setFalseName(String falseName) {
		FalseName = falseName;
	}

	public String getProEmail() {
		return ProEmail;
	}

	public void setProEmail(String proEmail) {
		ProEmail = proEmail;
	}

	public SexCode getSexcode() {
		return sexcode;
	}

	public void setSexcode(SexCode sexcode) {
		this.sexcode = sexcode;
	}
	
	
}
