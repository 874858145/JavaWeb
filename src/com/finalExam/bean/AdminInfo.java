package com.finalExam.bean;

/*
 * @author л����
 * class for setting and getting Administrator��s Information
 * �������ڻ�ȡ�����ù���Ա��Ϣ
 */

public class AdminInfo {
	
	/*
	 * aid 		����Ա�˺�
	 * passwd   ����Ա����
	 * gender	����Ա�Ա�
	 * tel		��ϵ�绰
	 * addr		�ջ���ַ
	 * email	��������
	 */
	
	private String aid;
	private String passwd;
	private String gender;
	private String tel;
	private String addr;
	private String email;
	
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
