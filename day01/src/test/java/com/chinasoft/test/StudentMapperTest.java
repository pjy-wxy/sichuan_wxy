package com.chinasoft.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chinasoft.mapper.StudentMapper;
import com.chinasoft.pojo.Student;
import com.chinasoft.util.SessionUtil;

public class StudentMapperTest {
	public  SqlSessionFactory factory =SessionUtil.getSession();
	
	
	public void selectAllStudent() {
		SqlSession session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> students = mapper.SelectAllStudent();
		for (Student student : students) {
			System.out.println(student);
		}
		session.close();
	}
	
	
	
	public void selectOneStudentWithGender() {
		SqlSession session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Student student = mapper.SelectOneAll(5);
		System.out.println(student);
		session.close();
	}
	
	public static void main(String[] args) {
		
	}
	
}
