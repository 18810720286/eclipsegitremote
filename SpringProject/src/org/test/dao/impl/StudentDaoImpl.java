package org.test.dao.impl;

import org.springframework.stereotype.Repository;
import org.test.dao.IStudentDao;
import org.test.entity.Student;

//@Component("studentDao")
@Repository("studentDao")
/**
 * @Component("studentDao")/@Repository("studentDao")�൱����������
 * <bean id="studentDao" class="org.test.dao.StudentDaoImpl">
 * @author ASUS
 *
 */
public class StudentDaoImpl implements IStudentDao{
	public void addStudent(Student student) {
		System.out.println("����ѧ��������");
	}
}
/**
 * @componentϸ����
 * dao��ע�⣺@repository
 * service��ע�⣺@Service
 * ��������ע�⣺@Controller
 */
