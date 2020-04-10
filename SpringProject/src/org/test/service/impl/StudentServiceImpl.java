package org.test.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.IStudentDao;
import org.test.dao.impl.StudentDaoImpl;
import org.test.entity.Student;
import org.test.service.IStudentService;

public class StudentServiceImpl implements IStudentService{

	IStudentDao studentDao = new StudentDaoImpl();

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

 
//	����Ҫ��Ϊ����ķ���ǰ����@Transactionalע��
	@Transactional(readOnly=false,propagation = Propagation.REQUIRED)
	@Override
	public void addStudent(Student student) {
//		�ж�ѧ���Ƿ����
//		���
		studentDao.addStudent(student);
		
	}
	
}
