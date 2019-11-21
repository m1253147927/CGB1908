package com.tedu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * jbdc�Ŀ������ų���
 * @author live
 *
 */
public class JdbcDemo1 {
public static void main(String[] args) throws Exception {
	//1ע�����ݿ�����
	Class.forName("com.mysql.jdbc.Driver");
	//2.��ȡ���ݿ�����
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt_db?characterEncoding=utf-8","root","root");
	//����Ǳ������Ҷ˿���3306���Լ�д
	Connection conn = DriverManager.getConnection("jdbc:mysql:///jt_db?characterEncoding=utf-8","root","root");
	//3.��ȡ������
	Statement stat = conn.createStatement();
	//4����sql��������ִ�У������ؽ��
	String sql = "select * from account";
	ResultSet rs = stat.executeQuery(sql);//���ڴ��β�ѯ���͵�sql��䣬����ֵ��ResultSet����
	//5.����������ӡ������̨��
	while(rs.next()){//������ָ�������е��α�����Ų��һ�У����Ų��ָ��һ�����ݣ�
		//����true���û��ָ���κ����ݣ��򷵻�false��
		int id = rs.getInt("id");
		String name = rs.getString("name");
		double money = rs.getDouble("money");
		System.out.println(id+":"+name+":"+money);
	}
	//6.�ͷ���Դ
	rs.close();
	stat.close();
	conn.close();
	
}
}
