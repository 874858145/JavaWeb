package com.finalExam.bean;

/*
 * @author л����
 * �������ڻ�ȡ�����û�Ա��Ϣ
 * class for set and get UserInfo
 */

public class UserInfo {
	
	/*
	 * cid 		��Ա�˺�
	 * passwd   ��Ա����
	 * gender	��Ա�Ա�
	 * tel		��ϵ�绰
	 * addr		�ջ���ַ
	 * email	��Ա����
	 * confirm	�޸����
	 */
	
	private String cid;
	private String passwd;
	private String gender;
	private String tel;
	private String addr;
	private String email;
	private String confirm;
	
	
	/*
	 * ���úͻ�ȡ����Getter and Setter
	 */
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
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
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
}

