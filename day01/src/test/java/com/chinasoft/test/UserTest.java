package com.chinasoft.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.chinasoft.pojo.User;

public class UserTest {

	public void test01() {
		// TODO Auto-generated method stub
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession(); 
		    //session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
			session.insert("com.chinasoft.mapper.usermapper.addUser");
			session.delete("com.chinasoft.mapper.usermapper.removeUser");
			session.update("com.chinasoft.mapper.usermapper.updateUser");
			User user = session.selectOne("com.chinasoft.mapper.usermapper.selectUser");
			System.out.println(user);
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UserTest().test01();
	}

}
