package com.chinasoft.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;

public class UserTest2 {
	  public SqlSessionFactory factory = SessionUtil.getSession();
	  
	  public void selectUser() {
		  SqlSession session = factory.openSession();
		  User user = session.selectOne("com.chinasoft.mapper.usermapper.selectUserByParameter", 3);
		  System.out.println(user);
		  session.close();
	  }
	  
	  public void selectUserAll() {
		  SqlSession session = factory.openSession();
		  List<User> user = session.selectList("com.chinasoft.mapper.usermapper.selectUserAll");
		  for(User user2: user) {
			  System.out.println(user2);
		  }
		  session.close();
	  }
	  
	  public void selectList() {
		  SqlSession session = factory.openSession();
		  List<Integer> id = new ArrayList<Integer>();
 		  List<User> user = session.selectList("com.chinasoft.mapper.usermapper.selectByList", id);
		  System.out.println(user);
		  session.close();
		  
	  }
	  
	  public void addUser() {
		  SqlSession session = factory.openSession();
		  User user = new User(99,"CSGO","RUSHB",null,null);
		  session.insert("com.chinasoft.mapper.usermapper.addUserByParameter", user);
		  session.commit();
		  session.close();
	  }
	  
	  public void deleteUser() {
		  SqlSession session = factory.openSession();
		  session.delete("com.chinasoft.mapper.usermapper.deleteUserByParemeter", 1);
		  session.commit();
		  session.close();
	  }
	  
	  public void updateUser() {
		  SqlSession session = factory.openSession();
		  session.update("com.chinasoft.mapper.usermapper.updateUserByParameter", "OW");
		  session.commit();
		  session.close();
	  }
	  
	  
      public static void main(String[] args) {
    	   //new UserTest2().selectUser();
    	   //new UserTest2().addUser();
    	   //new UserTest2().selectUserAll();
    	   //new UserTest2().deleteUser();
    	   //new UserTest2().updateUser();
    	  new UserTest2().selectList();
    	  
      }    
}