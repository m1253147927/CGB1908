package com.tedu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * jbdc的快速入门程序
 * @author live
 *
 */
public class JdbcDemo1 {
public static void main(String[] args) throws Exception {
	//1注册数据库驱动
	Class.forName("com.mysql.jdbc.Driver");
	//2.获取数据库连接
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt_db?characterEncoding=utf-8","root","root");
	//如果是本机并且端口是3306可以简写
	Connection conn = DriverManager.getConnection("jdbc:mysql:///jt_db?characterEncoding=utf-8","root","root");
	//3.获取传输器
	Statement stat = conn.createStatement();
	//4发送sql到服务器执行，并返回结果
	String sql = "select * from account";
	ResultSet rs = stat.executeQuery(sql);//用于大宋查询类型的sql语句，返回值是ResultSet对象
	//5.处理结果（打印到控制台）
	while(rs.next()){//可以让指向数据行的游标往下挪动一行，如果挪动指向一行数据，
		//返回true如果没有指向任何数据，则返回false。
		int id = rs.getInt("id");
		String name = rs.getString("name");
		double money = rs.getDouble("money");
		System.out.println(id+":"+name+":"+money);
	}
	//6.释放资源
	rs.close();
	stat.close();
	conn.close();
	
}
}
