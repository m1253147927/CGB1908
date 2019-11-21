package com.tedu.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;



import com.tedu.util.JdbcUtil;

/**
 * Jdbc����ɾ�Ĳ�
 * CRUD:C��create������ R��Retrieve����ѯU��update���޸�D��delete��ɾ��
 * @author live
 *
 */
public class JdbcCRUD {
	//��account���в���һ���µļ�¼��
	//nameΪ "john"��moneyΪ30000
	@Test
	public void add(){
		 Connection conn = null;
		    Statement stat = null;
		    ResultSet rs = null;
		    try {
		       //ע����������ȡ����
		       conn =JdbcUtil.getConn();
		       //��ȡ��������ִ��sql���
		       stat =conn.createStatement();
		       String sql = "insert into account values "
		              + "(null, 'john', 3000)";
		       int rows = stat.executeUpdate( sql );
		       System.out.println("Ӱ������: "+rows);
		    } catch (Exception e) {
		       e.printStackTrace();
		    } finally {
		       //���ù��߷����ͷ���Դ
		       JdbcUtil.close(conn, stat, rs);
		    }
		   
		}
	//�޸ģ��޸�account����nameΪ "john" �ļ�¼��
	//������Ϊ2500
	@Test
	public void update (){
		 Connection conn = null;
		    Statement stat = null;
		    ResultSet rs = null;
		    try {
				//ע����������ȡ����
		    	 conn =JdbcUtil.getConn();
		    	//��ȡ��������ִ��sql���
			       stat = conn.createStatement();
			       String sql = "update account set money = 2500 "
			              + "where name = 'john'";
			       int rows = stat.executeUpdate( sql );
			       System.out.println("Ӱ������: "+rows);
			} catch (Exception e) {
			e.printStackTrace();
			}finally{
				JdbcUtil.close(conn, stat, rs);
			}
	}
	//ɾ����ɾ��account����nameΪ "john" �ļ�¼
	@Test
	public void delete (){
		 Connection conn = null;
		    Statement stat = null;
		    ResultSet rs = null;
		    try {
				//ע����������ȡ����
		    	 conn =  JdbcUtil.getConn();
		    	//��ȡ��������ִ��sql���
			       stat =conn.createStatement();
			       String sql = "delete from accoun "
			              + "name = 'john'";
			       int rows = stat.executeUpdate( sql );
			       System.out.println("Ӱ������: "+rows);
			} catch (Exception e) {
			e.printStackTrace();
			}finally{
				JdbcUtil.close(conn, stat, rs);
			}
		
	}
	//��ѯaccount����idΪ1�ļ�¼
	@Test
	public void findById(){
		 Connection conn = null;
		    Statement stat = null;
		    ResultSet rs = null;
		    try {
				//ע����������ȡ����
		    	 conn = JdbcUtil.getConn();
		    	//��ȡ��������ִ��sql���
			       stat = conn.createStatement();
			       
			       String sql = " select * from account where id = 1";
			    rs =    stat.executeQuery(sql);
			       while(rs.next()){
			    	   int id = rs.getInt("id");
			    	   String name = rs.getString("name");
			    	   double money  = rs.getDouble("money");
			    	   System.out.println(id+":"+name+":"+money);
			       }
			} catch (Exception e) {
			e.printStackTrace();
			}finally{
				JdbcUtil.close(conn, stat, rs);
			}
	}
}
