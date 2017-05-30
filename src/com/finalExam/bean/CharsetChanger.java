package com.finalExam.bean;
import java.io.UnsupportedEncodingException;

/*
 * @author л����
 * class for solving EncodingException
 * �������ڽ�����ı�������
 */

public class CharsetChanger {
	public static String toChinese(String str){
		if(str==null)str="";
		try{
			str=new String(str.getBytes("ISO-8859-1"),"UTF8");
		}catch(UnsupportedEncodingException e){
			str="";
			e.printStackTrace();					
		}
		return str;
	}
}
