package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.Student;

public interface StudentMapper {
	
	//�鿴ѧ���������
	List<Student> SelectAllStudent();
	
	//�鿴ĳ��ѧ�������е���Ϣ
	Student  SelectOneAll(int id);
	
}
