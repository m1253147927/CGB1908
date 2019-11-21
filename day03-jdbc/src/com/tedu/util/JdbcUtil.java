package com.tedu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** JDBC������ */
public class JdbcUtil {
	/**
	 * ��ȡ���ݿ����Ӷ��󲢷���
	 * 
	 * @return Connection ���Ӷ���
	 * @throws Exception
	 */
public static Connection getConn() throws Exception {
		// 1.ע������
		Class.forName("com.mysql.jdbc.Driver");
		// 2.��ȡ����
		Connection conn = DriverManager.getConnection("jdbc:mysql:///jt_db?characterEncoding=utf-8", "root", "root");
		return conn;
	}

	/**
	 * �ͷ�JDBC�����е���Դ
	 * 
	 * @param conn
	 *            ���Ӷ���
	 * @param stat
	 *            ����������
	 * @param rs
	 *            ���������
	 */
	public static void close(Connection conn, Statement stat, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
		if (stat != null) {
			try {
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				stat = null;
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}
}
