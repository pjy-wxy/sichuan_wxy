package com.chinasoft.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;

public class UserTest3 {
    public SqlSessionFactory factory = SessionUtil.getSession();
	
    public void  addUserNoPar() {
    	SqlSession session = factory.openSession();
    	UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.addUserNoPar();
        session.commit();
        session.close();
    }
    
    public void addUserByPar() {
    	SqlSession session = factory.openSession();
    	UserMapper mapper = session.getMapper(UserMapper.class);
    	User user = new User(666,"Ñ¹Ëõ","789789","null","null");
    	mapper.addUserByPar(user);
    	session.commit();
        session.close();
    }
    
    public void selectOneByPar() {
    	SqlSession session = factory.openSession();
    	UserMapper mapper = session.getMapper(UserMapper.class);
    	User user = mapper.selectOneByPar(5);
    	System.out.println(user);
    	session.close();
    }
    
    public void selectAll() {
    	SqlSession session = factory.openSession();
    	UserMapper mapper = session.getMapper(UserMapper.class);
    	List<User> list = mapper.selectAll();
		for(User user: list) {
			  System.out.println(user);
		}
		session.close();

    }
    
    public void selectLogin() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setUsername("Ñ¹Ëõ");
		user.setPassword("789789");
		User user1 = mapper.selectLogin(user);
		System.out.println(user1);
		session.close();
	}
    
    public void selectOrderBy() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> users = mapper.selectOrderBy("username");
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}
    
	public static void main(String[] args) {
         //new UserTest3().addUserNoPar();
         //new UserTest3().addUserByPar();
		 //new UserTest3().selectOneByPar();
		 //new UserTest3().selectAll();
         //new UserTest3().selectOrderBy();
		 new UserTest3().selectLogin();
	}

}
